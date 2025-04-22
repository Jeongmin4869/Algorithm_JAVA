import java.util.*;
import java.io.*;

class Main_B2468{
    static int N, count = 0;
    static boolean[][] visited;
    static int[][] map;
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        visited = new boolean[N][N];
        map = new int[N][N];

        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int max = 0;
        for(int depth=0; depth<100; depth++){
            visited = new boolean[N][N];
            count = 0;
            for(int j=0; j<N; j++){
                for(int k=0; k<N; k++){
                    if(map[j][k]>depth&&!visited[j][k]){
                        count += 1;
                        dfs(depth, j, k);
                    }
                }
            }
            max = Math.max(max, count);
        }
        
        System.out.println(max);
    }

    static public void dfs(int depth, int x, int y){
        visited[x][y] = true;
        for(int i=0; i<4; i++){
            int px = x + dx[i];
            int py = y + dy[i];
            if( px>=0&&px<N&&py>=0&&py<N
                && map[px][py]>depth&&!visited[px][py]){
                dfs(depth, px, py);
            }
        }
        return;
    }
}
