import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {0, 1, 0, -1, 1, 1, -1, -1};
    static int[] dy = {1, 0, -1, 0, 1, -1, 1, -1};    
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        while(true){
            st = new StringTokenizer(br.readLine());
            int w = Integer.parseInt(st.nextToken());
            int h = Integer.parseInt(st.nextToken());
            if(w == 0 && h == 0) return;

            map = new int[h][w];

            for(int i=0; i<h; i++){
                st = new StringTokenizer(br.readLine());
                for(int j=0; j<w; j++){
                    map[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            int count = 0;
            visited = new boolean[h][w];
            for(int i=0; i<h; i++){                
                for(int j=0; j<w; j++){
                    if(map[i][j] == 1 && !visited[i][j]){
                        count += 1;
                        //dfs(i, j, h, w);
                        bfs(i, j, h, w);
                    }
                }
            }

            System.out.println(count);
        }
    }

    public static void dfs(int x, int y, int h, int w){
        visited[x][y] = true;

        for(int i=0; i<8; i++){
            int xx = x + dx[i];
            int yy = y + dy[i];
            if(xx >= 0 && xx < h && yy >= 0 && yy < w && !visited[xx][yy] && map[xx][yy] == 1){
                dfs(xx, yy, h, w);
            }
        }        
    }

    public static void bfs(int x, int y, int h, int w){
        visited[x][y] = true;
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{x, y});
    
        while(!q.isEmpty()){
            int[] pos = q.poll();
            int px = pos[0];
            int py = pos[1];
            
            for(int i=0; i<8; i++){
                int xx = px + dx[i];
                int yy = py + dy[i];
                if(xx>=0 && xx<h && yy>=0 && yy<w && !visited[xx][yy] && map[xx][yy] == 1){
                    visited[xx][yy] = true;
                    q.offer(new int[] {xx, yy});
                }
            }
        }
    }
}
