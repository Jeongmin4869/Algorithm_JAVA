import java.util.*;
import java.io.*;

class Main_B1388 {

    static int n, m;
    static boolean[][] visited;
    static char[][] c;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        visited = new boolean[n][m];
        c = new char[n][m];

        for(int i=0; i<n; i++){
            c[i] = br.readLine().toCharArray();
        }

        int count = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(!visited[i][j]){
                    count += 1;
                    dfs(i, j, c[i][j]);
                }
            }
        }
        
        System.out.println(count);
    }

    static void dfs(int x, int y, char tile){
        visited[x][y] = true;

        if(tile == '-'){
            if(y+1<m && !visited[x][y+1] && c[x][y+1]=='-'){
                dfs(x, y+1, tile);
            }
        }
        else if(tile == '|'){
            if(x+1<n && !visited[x+1][y] && c[x+1][y]=='|'){
                dfs(x+1, y, tile);
            }
        }
    }

    static void bfs(int x, int y, char tile){
        visited[x][y] = true;
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] {x, y});

        while(!q.isEmpty()){
            int[] node = q.poll();
            int xx = node[0];
            int yy = node[1];

            if(tile == '-'){
                if(yy+1<m && !visited[xx][yy+1] && c[xx][yy+1]=='-'){
                    visited[xx][yy+1] = true;
                    q.add(new int[]{xx, yy+1});
                }
            }
            else if(tile == '|'){
                if(xx+1<n && !visited[xx+1][yy] && c[xx+1][yy]=='|'){
                    visited[xx+1][yy] = true;
                    q.add(new int[]{xx+1, yy});
                }
            }
        }
    }
    
}
