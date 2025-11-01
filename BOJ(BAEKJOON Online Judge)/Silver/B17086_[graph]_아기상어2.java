import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static int N, M;
    static int[][] map;     
    static int[] dx = {1,1,1,0,0,-1,-1,-1};
    static int[] dy = {1,0,-1,1,-1,1,0,-1};
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M]; 
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<M; j++){
                map[i][j] = Integer.parseInt(st.nextToken());                
            }
        }

        int count = 0;
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(map[i][j] == 0) {
                    count = Math.max(count, bfs(i, j));
                }
            }
        }
        System.out.println(count);
    }

    public static int bfs(int x, int y){        
        boolean[][] visited = new boolean[N][M];
        visited[x][y] = true;
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{x, y, 1});
        
        while(!q.isEmpty()){
            int[] pos =  q.poll();
            int px = pos[0];
            int py = pos[1];
            int dep = pos[2];
            
            if(map[px][py] == 1) return dep-1;
            
            for(int i=0; i<8; i++){
                int xx = px + dx[i];
                int yy = py + dy[i];
                if(xx>=0 && xx<N && yy>=0 && yy<M && !visited[xx][yy]){
                    visited[xx][yy] = true;
                    q.offer(new int[] {xx, yy, dep+1});
                }
            }
        }
        return 0;
    }

}
