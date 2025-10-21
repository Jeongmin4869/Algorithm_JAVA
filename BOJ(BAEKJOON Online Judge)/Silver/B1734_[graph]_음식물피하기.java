import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    static int M, N, K;
    static boolean[][] arr;
    static int[] dx = {1,0,-1,0};
    static int[] dy = {0,-1,0,1};
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        arr = new boolean[N][M];

        for(int i=0; i<K; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[a-1][b-1] = true;
        }

        int result = 0;
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(arr[i][j]){
                    result = Math.max(bfs(i, j), result);
                }
                    
            }
        }

        System.out.print(result);
        
    }

    public static int bfs(int x, int y){
        int count = 0;
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{x, y});
        arr[x][y] = false;
        while(!q.isEmpty()){
            int[] pos = q.poll();
            int px = pos[0];
            int py = pos[1];
            count += 1;
            for(int i=0; i<4; i++){
                int xx = dx[i] + px;
                int yy = dy[i] + py;
                if(xx>=0 && xx<N && yy>= 0 && yy<M && arr[xx][yy]){
                    arr[xx][yy] = false;
                    q.offer(new int[]{xx, yy});
                }
            }
        }
        return count;
    }
}
