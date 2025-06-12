import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] arr = new int[N][M];
        boolean[][] visited = new boolean[N][M];
        for(int i=0; i<N; i++){
            String str = br.readLine();
            for(int j=0; j<M; j++){
                arr[i][j] = str.charAt(j) - '0';
            }
        }

        bfs(N, M, arr, visited);

        System.out.print(arr[N-1][M-1]);
        
    }

    public static void bfs(int N, int M, int[][] arr, boolean[][] visited){
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, -1, 0, 1};
        visited[0][0] = true;
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[] {0, 0});
        while(!q.isEmpty()){
            int[] top = q.poll();
            int px = top[0];
            int py = top[1];

            if(px==N-1 && py==M-1) return;
            
            for(int i=0; i<4; i++){
                int xx = px + dx[i];
                int yy = py + dy[i];
                if(xx>=0 && xx<N && yy>=0 && yy<M && !visited[xx][yy]){
                    visited[xx][yy] = true;
                    arr[xx][yy] = arr[px][py] + 1;
                    q.offer(new int[]{xx, yy});
                }
            }
        }
    }
}
