import java.util.*;
import java.io.*;

class Main {
    static ArrayList<ArrayList<Integer>> g;
    static int[][] arr;
    static boolean[][] visited;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int N, M;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st ;

        int T = Integer.parseInt(br.readLine());

        while(T>0){
            T--;

            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            arr = new int[N][M];
            visited = new boolean[N][M];
            for(int i=0; i<K; i++){
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                arr[x][y] = 1;
            }

            int count = 0;
            for(int i=0; i<N; i++){
                for(int j=0; j<M; j++){
                    if(arr[i][j] == 1 && !visited[i][j]){
                        count += 1;
                        bfs(i, j);
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
            if(xx >= 0 && xx < N && yy >= 0 && yy < M && !visited[xx][yy] && arr[xx][yy] ==1 ){
                dfs(xx, yy);
            }
        }
    }


    public static void bfs(int x, int y){

        Queue<int[]> q = new LinkedList<>();
        visited[x][y] = true;
        q.offer(new int[] {x, y});
        while(!q.isEmpty()){
            int[] newnode = q.poll();
            int qx = newnode[0];
            int qy = newnode[1];
            for(int i=0; i<4; i++){
                int xx = qx + dx[i];
                int yy = qy + dy[i];
                if(xx >= 0 && xx < N && yy >= 0 && yy < M && !visited[xx][yy] && arr[xx][yy] ==1 ){
                    visited[xx][yy] = true;
                    q.offer(new int[] {xx, yy});
                }
            }
        }
    }
}
