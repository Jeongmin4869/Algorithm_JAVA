import java.util.*;
import java.io.*;

class Main {
    static int N, M;
    static char[][] map;
    static boolean[][] visited;
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new char[N][M];
        visited = new boolean[N][M];
        
        for(int i=0; i<N; i++){
            String str = br.readLine().toString();
            for(int j=0; j<M; j++){
                map[i][j] = str.charAt(j);   
            }
        }

        int result = 0;
        for(int i=0; i<N; i++){            
            for(int j=0; j<M; j++){
                if(map[i][j] == 'I')                      
                    result = bfs(i, j);                    
            }
        }
                
        if(result == 0) System.out.println("TT");
        else System.out.println(result);
    }

    public static int bfs(int x, int y){
        int count = 0;
        visited[x][y] = true;
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[] {x, y});       
        while(!q.isEmpty()){
            int[] pos = q.poll();
            int px = pos[0];
            int py = pos[1];

            if(map[px][py] == 'P'){                
                count += 1;
            }
            
            for(int i=0; i<4; i++){
                int xx = px + dx[i];
                int yy = py + dy[i];
                if(xx>=0 && xx <N && yy>=0  && yy <M && !visited[xx][yy] && map[xx][yy] != 'X'){
                    visited[xx][yy] = true;                    
                    q.offer(new int[] {xx, yy});
                }
            }
        }
        return count ;
    }
}
