import java.util.*;
import java.io.*;

class Main {
    static boolean[][] visited;
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static int N ;
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        char[][] normalmap = new char[N][N];
        char[][] colorblindmap = new char[N][N];
                
        String str;
        for(int i=0; i<N; i++){
            str = br.readLine().toString();
            for(int j=0; j<N; j++){
                normalmap[i][j] = str.charAt(j);
                colorblindmap[i][j] = str.charAt(j);
                if(colorblindmap[i][j] == 'G')
                    colorblindmap[i][j] = 'R';
                
            }
        }

        int count = 0;
        visited = new boolean[N][N];
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(!visited[i][j]){
                    dfs(i, j, normalmap[i][j], normalmap);
                    count += 1;
                }                
            }
        }
        System.out.print(count);

        count = 0;
        visited = new boolean[N][N];
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(!visited[i][j]){
                    dfs(i, j, colorblindmap[i][j], colorblindmap);
                    count += 1;
                }                
            }
        }
        System.out.print(" " + count);
    }

    public static void dfs(int x, int y, char c, char[][] map){
        visited[x][y] = true;

        for(int i=0; i<4; i++){
            int xx = x + dx[i];
            int yy = y + dy[i];
            if(xx >= 0 && xx < N && yy >= 0 && yy < N && !visited[xx][yy] && map[xx][yy] == c){
                dfs(xx, yy, c, map);
            }
        }        
    }
}
