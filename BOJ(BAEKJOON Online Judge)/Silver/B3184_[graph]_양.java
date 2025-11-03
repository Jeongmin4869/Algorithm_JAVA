import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static int N, M;
    static int o, v;
    static int[][] map;     
    static boolean[][] visited;
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M]; 
        visited = new boolean[N][M];
        
        for(int i=0; i<N; i++){
            String str = br.readLine().toString();
            for(int j=0; j<M; j++){
                map[i][j] = str.charAt(j);
            }
        }

        int totalo = 0;
        int totalv = 0;
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(!visited[i][j] && map[i][j] != '#' ) {                    
                    o = 0;
                    v = 0;
                    // bfs(i, j);
                    dfs(i, j);
                    if(o > v) totalo += o;
                    else totalv += v;
                }
            }
        }
        
        System.out.println(totalo + " " + totalv);
    }

    public static void dfs(int x, int y){
        visited[x][y] = true;
        if(map[x][y] == 'o') o+=1;
        if(map[x][y] == 'v') v+=1;
        for(int i=0; i<4; i++){
            int xx = x + dx[i];
            int yy = y + dy[i];
            if(xx>=0 && xx<N && yy>=0 && yy<M && !visited[xx][yy] && map[xx][yy] != '#'){
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

            if(map[px][py] == 'o') o += 1;
            if(map[px][py] == 'v') v += 1;
            
            for(int i=0; i<4; i++){
                int xx = px + dx[i];
                int yy = py + dy[i];
                if(xx>=0 && xx<N && yy>=0 && yy<M && !visited[xx][yy] && map[xx][yy] != '#'){
                    visited[xx][yy] = true;
                    q.offer(new int[] {xx, yy});
                }
            }
        }
    }
}
