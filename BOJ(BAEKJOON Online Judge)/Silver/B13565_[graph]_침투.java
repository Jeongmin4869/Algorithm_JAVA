import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static int N, M;
    static char[][] map;     
    static boolean[][] visited;
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new char[N][M]; 
        
        for(int i=0; i<N; i++){
            String str = br.readLine().toString();
            for(int j=0; j<M; j++){
                map[i][j] = str.charAt(j);
            }            
        }

        for(int i=0; i<M; i++){
            if(map[0][i] == '0'){
                if(bfs(0, i)){
                    System.out.print("YES");
                    return; 
                }
            }
        }

        System.out.print("NO");
    }

    public static boolean bfs(int x, int y){        
        visited = new boolean[N][M];
        visited[x][y] = true;
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[] {x, y});
        while(!q.isEmpty()){
            int[] pos = q.poll();
            int px = pos[0];
            int py = pos[1];
            
            if(px == N-1) return true;
            
            for(int i=0; i<4; i++){
                int xx = px + dx[i];
                int yy = py + dy[i];
                if(xx>=0 && xx<N && yy>=0 && yy<M && !visited[xx][yy] && map[xx][yy] == '0'){
                    visited[xx][yy] = true;
                    q.offer(new int[] {xx, yy});
                }
            }
        }
        return false;
    }
}
