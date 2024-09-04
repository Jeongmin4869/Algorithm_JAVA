import java.util.*;
import java.io.*;

class Main_B1012 {
    static int n, m, k;
    static int[][] area;
    static boolean[][] visited;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        while(T>0){
            T--;

            StringTokenizer st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());

            area = new int[n][m];
            visited = new boolean[n][m];

            for(int i=0; i<k; i++){
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                area[x][y] = 1;
            }

            int count = 0;
            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++){
                    if(area[i][j]==1 && !visited[i][j]){
                        count += 1;
                        dfs(i, j);
                    }
                }
            }
            sb.append(count).append("\n");
        }
        System.out.println(sb);
    }

    public static void dfs(int x, int y){

        visited[x][y] = true;

        for(int i=0; i<4; i++){
            int xx = x + dx[i];
            int yy = y + dy[i];
            if(xx<0 || xx>=n || yy<0 || yy>=m) continue;
            if(area[xx][yy]==1 && !visited[xx][yy]){
                dfs(xx, yy);
            }
        }    
    } 
}
