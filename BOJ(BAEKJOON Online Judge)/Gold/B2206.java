import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    static int N, M;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
         N = Integer.parseInt(st.nextToken());
         M = Integer.parseInt(st.nextToken());
        int[][] arr = new int[N][M];
        boolean[][][] visited = new boolean[N][M][2];
        for(int i=0; i<N; i++){
            String str = br.readLine();
            for(int j=0; j<M; j++){
                arr[i][j] = str.charAt(j) - '0';
            }
        }

        int result = bfs(N, M, arr, visited);
        System.out.print(result);
        
    }

    public static int bfs(int N, int M, int[][] arr, boolean[][][] visited){
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, -1, 0, 1};
        visited[0][0][0] = true;
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[] {0, 0, 0, 1}); // x, y, isbroken, dis
        while(!q.isEmpty()){
            int[] top = q.poll();
            int px = top[0];
            int py = top[1];
            int isBroken = top[2];
            int dis = top[3];

            if(px==N-1 && py==M-1) return dis;
            
            for(int i=0; i<4; i++){
                int xx = px + dx[i];
                int yy = py + dy[i];
                
                if(xx>=0 && xx<N && yy>=0 && yy<M){
                    if(arr[xx][yy] == 0 && !visited[xx][yy][isBroken]){
                        visited[xx][yy][isBroken] = true;
                        q.offer(new int[] {xx, yy, isBroken, dis+1});
                    }
                    if(arr[xx][yy] == 1 && isBroken == 0 && !visited[xx][yy][isBroken]){                        
                        visited[xx][yy][isBroken+1] = true;
                        q.offer(new int[] {xx, yy, isBroken+1, dis+1});
                    }
                }
            }           
        }
         return -1;
    }
}
