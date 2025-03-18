import java.util.*;
import java.io.*;

class Main_B7569 {
    static int N, M, H;
    static int count = 0;
    
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, -1, 0, 1};
    static int[] dz = {1, -1};
    static Queue<Tomatos> q = new LinkedList<>();
    static int[][][] box ;
    static class Tomatos{
        int x;
        int y;
        int z;
        int days;

        public Tomatos(int x, int y, int z, int days){
            this.x = x;
            this.y = y;
            this.z = z;
            this.days = days;
        }
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        H = Integer.parseInt(st.nextToken());
        box = new int[H][M][N];
        for(int i=0; i<H; i++){
            for(int j=0; j<M; j++){
                st = new StringTokenizer(br.readLine());
                for(int k =0; k<N; k++){
                    box[i][j][k] = Integer.parseInt(st.nextToken());
                    if(box[i][j][k] == 0) count += 1;
                    if(box[i][j][k] == 1) q.offer(new Tomatos(j, k, i, 0));
                }
            }
        }
    
        System.out.println(dfs());
        
    }

    public static int dfs(){
        int MaxDay = 0;
        while(!q.isEmpty()){
            Tomatos now = q.poll();
            for(int i=0; i<4; i++){
                int px = now.x + dx[i];
                int py = now.y + dy[i];
                if(px>=0 && px<M && py>=0 && py<N && box[now.z][px][py]==0){
                    count -= 1;
                    box[now.z][px][py] = 1;
                    MaxDay = Math.max(now.days+1, MaxDay);
                    q.offer(new Tomatos(px, py, now.z, now.days+1));
                }
            }

            for(int i=0; i<2; i++){
                int pz = now.z + dz[i];
                if(pz>=0 && pz<H && box[pz][now.x][now.y] == 0){
                    count -= 1;
                    box[pz][now.x][now.y] = 1;
                    MaxDay = Math.max(now.days+1, MaxDay);
                    q.offer(new Tomatos(now.x, now.y, pz, now.days+1));
                }
            }
        }
        if(count > 0) return -1;
        return MaxDay;
        
    }
}
