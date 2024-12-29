import java.util.*;
import java.io.*;

class Main_B1189 {
    static int R;
    static int C;
    static int K;
    static int count;
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static boolean[][] visited;
    static int[][] map;

    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        count = 0;
        visited = new boolean[R][C];
        map = new int[R][C];

        for(int i=0; i<R; i++){
            String line = br.readLine();
            for(int j=0; j<C; j++){
                if(line.charAt(j) == 'T'){
                    map[i][j] = 1;
                }
            }
        }

        visited[R-1][0] = true;
        dfs(R-1, 0, 1);

        System.out.println(count);
        
    }

    public static void dfs(int x, int y, int now){
        if(now==K){
            if(x == 0 && y==(C-1)){
                count += 1;
            }
            return;
        }

        for(int i=0; i<4; i++){
            int tx = x+dx[i];
            int ty = y+dy[i];
            if(tx>=0&&tx<R&&ty>=0&&ty<C&&map[tx][ty]!=1&&!visited[tx][ty]){
                visited[tx][ty] = true;
                dfs(tx, ty, now+1);
                visited[tx][ty] = false;
            }
        }
    }
}
