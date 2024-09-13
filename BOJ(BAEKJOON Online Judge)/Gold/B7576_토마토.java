import java.util.*;
import java.io.*;

class Main_B7576 {
    static boolean[][] visited;
    static int[][] box;
    static int[] dx = {1,0,-1,0};
    static int[] dy = {0,1,0,-1};
    static Queue<int[]> q;
    static int N, M;
    static int count;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
    
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        visited = new boolean[N][M];
        box = new int[N][M];
        count = 0;
        q = new LinkedList<>();
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<M; j++){
                box[i][j] = Integer.parseInt(st.nextToken());
                if(box[i][j]==0) count += 1;
                if(box[i][j]==1) q.offer(new int[] {i, j, 0});
            }
        }

        int result = bfs();
        
        System.out.println(result);

       br.close();
    }

    public static int bfs(){
        int maxday = 0;
        while(!q.isEmpty()){
            int[] arr = q.poll();
            int x = arr[0];
            int y = arr[1];
            int day = arr[2];
            for(int i=0; i<4; i++){
                int xx = x + dx[i];
                int yy = y + dy[i];
                if(xx<N&&xx>=0&&yy<M&&yy>=0&&box[xx][yy]==0){
                    box[xx][yy] = 1;
                    count -= 1;
                    q.offer(new int[] {xx, yy, day+1});
                }
            }
            if(maxday < day) maxday = day;
        }
        
        if(count == 0) return maxday;
        return -1;
        

    }

    
}
