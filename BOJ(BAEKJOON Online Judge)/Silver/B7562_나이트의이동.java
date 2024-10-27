import java.util.*;
import java.io.*;

class Main_B7562 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            int I = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            int sx = Integer.parseInt(st.nextToken());
            int sy = Integer.parseInt(st.nextToken());
            
            st = new StringTokenizer(br.readLine());
            int ex = Integer.parseInt(st.nextToken());
            int ey = Integer.parseInt(st.nextToken());

            int result = bfs(I, sx, sy, ex, ey);
            sb.append(result).append("\n");
        }
        System.out.println(sb);
    }

    public static int bfs(int M, int sx, int sy, int ex, int ey){
        int count = 0;
        int[][] map = new int[M][M];
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[] {sx, sy});

        int[] dx = {2, 2, -2,-2, 1, 1, -1, -1};
        int[] dy = {1,-1, -1, 1, 2,-2,  2, -2};
        
        while(!q.isEmpty()){
            int[] now = q.poll();
            int xx = now[0];
            int yy = now[1];
            
            if(xx == ex && yy == ey) return map[xx][yy];

            for(int i=0; i<8; i++){
                int nx = xx+dx[i];
                int ny = yy+dy[i];
                if(nx >= 0 && nx < M && ny >=0 && ny < M && map[nx][ny] == 0){
                    map[nx][ny] = map[xx][yy]+1;
                    q.offer(new int[] {nx,ny});
                }
            }

            /*
            if(xx+1 >= 0 && xx+1 < M && yy+2 >=0 && yy+2 < M && map[xx+1][yy+2] == 0){
                map[xx+1][yy+2] = map[xx][yy]+1;
                q.offer(new int[] {xx+1, yy+2});
            }
            if(xx-1 >= 0 && xx-1 < M && yy+2 >=0 && yy+2 < M && map[xx-1][yy+2] == 0){
                map[xx-1][yy+2] = map[xx][yy]+1;
                q.offer(new int[] {xx-1, yy+2});
            }
            if(xx+1 >= 0 && xx+1 < M && yy-2 >=0 && yy-2 < M && map[xx+1][yy-2] == 0){
                map[xx+1][yy-2] = map[xx][yy]+1;
                q.offer(new int[] {xx+1, yy-2});
            }
            if(xx-1 >= 0 && xx-1 < M && yy-2 >=0 && yy-2 < M && map[xx-1][yy-2] == 0){
                map[xx-1][yy-2] = map[xx][yy]+1;
                q.offer(new int[] {xx-1, yy-2});
            }

            
            if(xx+2 >= 0 && xx+2 < M && yy+1 >=0 && yy+1 < M && map[xx+2][yy+1] == 0){
                map[xx+2][yy+1] = map[xx][yy]+1;
                q.offer(new int[] {xx+2, yy+1});
            }
            if(xx-2 >= 0 && xx-2 < M && yy+1 >=0 && yy+1 < M && map[xx-2][yy+1] == 0){
                map[xx-2][yy+1] = map[xx][yy]+1;
                q.offer(new int[] {xx-2, yy+1});
            }
            if(xx+2 >= 0 && xx+2 < M && yy-1 >=0 && yy-1 < M && map[xx+2][yy-1] == 0){
                map[xx+2][yy-1] = map[xx][yy]+1;
                q.offer(new int[] {xx+2, yy-1});
            }
            if(xx-2 >= 0 && xx-2 < M && yy-1 >=0 && yy-1 < M && map[xx-2][yy-1] == 0){
                map[xx-2][yy-1] = map[xx][yy]+1;
                q.offer(new int[] {xx-2, yy-1});
            }
            */
        }
        return -1;
    }
}
