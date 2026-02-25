import java.util.*;
import java.io.*;

class Main {
    static int N, L , R;
    static int[][] map ;
    static boolean[][] visited;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        L = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());

        map = new int[N][N];

        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int count = 0;
        
        while(true){
            visited = new boolean[N][N];
            boolean moved = false;
            for(int i=0;i<N; i++){
                for(int j=0; j<N; j++){
                    if(!visited[i][j]){
                        if(bfs(i,j)){
                            moved = true;
                        }
                    }
                }
            }
            if(!moved) break;
            else count += 1;
        }

        
        System.out.println(count);
    }

    public static boolean bfs(int x, int y){
        Queue<int[]> q = new LinkedList<>();
        Queue<int[]> union = new LinkedList<>();
        q.offer(new int[]{x, y});
        union.offer(new int[]{x,y});
        visited[x][y] = true;
        int sum = map[x][y];
        while(!q.isEmpty()){
            int[] top = q.poll();
            int px = top[0];
            int py = top[1];
            for(int i=0; i<4; i++){
                int xx = dx[i] + px;
                int yy = dy[i] + py;
                if(xx<0 || xx >= N || yy<0 || yy>=N) continue;
                if(visited[xx][yy]) continue;
           
                int dif = Math.abs(map[px][py]-map[xx][yy]);
                if(dif<L || dif>R) continue;
                
                visited[xx][yy] = true;
                q.offer(new int[]{xx, yy});
                union.offer(new int[]{xx, yy});
                sum += map[xx][yy];         
            }
        }
        
        if(union.size()==1) return false;

        int avg = sum/union.size();

        while(!union.isEmpty()){
            int[] top = union.poll();
            map[top[0]][top[1]] = avg;
        }

        return true;
    }
}
