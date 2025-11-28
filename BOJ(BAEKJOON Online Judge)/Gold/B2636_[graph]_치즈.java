import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    static int N, M;
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, -1, 0, 1};
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<M; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int now = check(map);
        int last = now;
        int time = 0;

        while(now!=0){
            last = now;
            time += 1;
            
            if(now == 0){
                break;
            }
            
            visited = new boolean[N][M];
            //dfs(0,0);
            bfs(0,0);

            map = change(map);
            now = check(map);
            
        }

        System.out.println(time);
        System.out.print(last);
    }

    public static int check(int[][] arr){
        int count = 0;
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(arr[i][j]==1) count += 1;
            }
        }
        return count;
    }

    public static int[][] change(int[][] arr){
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(arr[i][j]==2) arr[i][j] = 0;
            }
        }
        return arr;
    }
    
    public static void dfs(int x, int y){
        visited[x][y] = true;
        for(int i=0; i<4; i++){
            int xx = dx[i]+x;
            int yy = dy[i]+y;
            if(xx>=0 && xx<N && yy>=0 && yy<M && !visited[xx][yy]){
                if(map[xx][yy] == 0) dfs(xx, yy);
                if(map[xx][yy] == 1){
                    map[xx][yy]=2;
                }
            }
        }
    }

    public static void bfs(int x, int y){
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{x, y});
        visited[x][y] = true;
        while(!q.isEmpty()){
            int[] top = q.poll();
            int px = top[0];
            int py = top[1];
            for(int i=0; i<4; i++){
                int xx = px+dx[i];
                int yy = py+dy[i];
                if(xx>=0&&xx<N&&yy>=0&&yy<M&&!visited[xx][yy]){
                    visited[xx][yy] = true;
                    if(map[xx][yy]==0)
                        q.offer(new int[]{xx,yy});
                    if(map[xx][yy]==1)
                        map[xx][yy] = 2;
                }
            }
        }
    }
}
