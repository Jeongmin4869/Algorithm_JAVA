import java.util.*;
import java.io.*;

class Main_B1245 {
    static int N, M;
    static boolean iaPeek;
    static int[] dx = {-1, -1, -1,  0, 0,  1, 1, 1};
    static int[] dy = {-1,  0,  1, -1, 1, -1, 0, 1};
    static int[][] map ;    
    static boolean[][] visited;
    
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
                if(map[i][j] > 0 &&!visited[i][j]){
                    iaPeek = true;
                    dfs(i, j);
                    if(iaPeek) count += 1;
                }
            }
        }    
        
        System.out.println(count);
    }

    public static void dfs(int x, int y){
        visited[x][y] = true;
        boolean top = true;
        int max = map[x][y];
        for(int i=0; i<8; i++){
            int px = x + dx[i];
            int py = y + dy[i];
            if(px >= 0 && px < N && py >= 0 && py < M){
                if(map[px][py] > max){
                    iaPeek = false;
                }   
                if(!visited[px][py] && map[px][py] == max){
                    dfs(px ,py);
                }                    
            }
        }              
    }    
}
