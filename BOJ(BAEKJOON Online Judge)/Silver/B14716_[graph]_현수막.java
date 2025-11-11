import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    static int N, M;
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {1, 1, 1, 0, 0, -1, -1, -1};
    static int[] dy = {1, 0, -1, 1, -1, 1, 0, -1};
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        visited = new boolean[N][M];
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<M; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int count = 0;
        for(int i=0; i<N; i++){            
            for(int j=0; j<M; j++){
                if(map[i][j] == 1 && !visited[i][j]){
                    count += 1;
                    //bfs(i, j);
                    dfs(i,j);
                }
            }
        }
        System.out.print(count);
    }

    public static void dfs(int x, int y){
        visited[x][y] = true;
        for(int i=0; i<8; i++){
            int xx = x + dx[i];
            int yy = y + dy[i];
            if(xx>=0 && xx<N && yy>=0 && yy<M && !visited[xx][yy] && map[xx][yy] == 1 ){
                dfs(xx, yy);
            }
        }
    }


    
    public static void bfs(int x, int y){
        visited[x][y] = true;
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[] {x, y});
        while(!q.isEmpty()){
            int[] pos = q.poll();
            int px = pos[0];
            int py = pos[1];

            for(int i=0; i<8; i++){
                int xx = px + dx[i];
                int yy = py + dy[i];
                if(xx>=0 && xx<N && yy>=0 && yy<M && !visited[xx][yy] && map[xx][yy] == 1){
                    visited[xx][yy] = true;
                    q.offer(new int[] {xx, yy});
                }
            }
        }
    }
}
