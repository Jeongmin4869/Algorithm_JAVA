import java.util.*;
import java.io.*;

class Main_B7562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        
        for(int i=0; i<N; i++){
            int l = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int result = bfs(l, x1, y1, x2, y2);
            sb.append(result).append("\n");
        }
        System.out.println(sb); 
    }

    public static int bfs(int l, int sx, int sy, int ex, int ey){
        Queue<int[]> q = new LinkedList<>();
        int[][] map = new int[l][l];
        q.offer(new int[] {sx, sy});
        while(!q.isEmpty()){
           int[] now = q.poll();
            int xx = now[0];
            int yy = now[1];
            if(xx==ex && yy==ey) return map[xx][yy];
            if(xx+2>=0 && xx+2<l && yy+1 >=0 && yy+1<l && map[xx+2][yy+1]==0){
                map[xx+2][yy+1] = map[xx][yy]+1;
                q.offer(new int[] {xx+2, yy+1});
            }
            if(xx+2>=0 && xx+2<l && yy-1 >=0 && yy-1<l && map[xx+2][yy-1]==0){
                map[xx+2][yy-1] = map[xx][yy]+1;
                q.offer(new int[] {xx+2, yy-1});
            }
            if(xx+1>=0 && xx+1<l && yy+2 >=0 && yy+2<l && map[xx+1][yy+2]==0){
                map[xx+1][yy+2] = map[xx][yy]+1;
                q.offer(new int[] {xx+1, yy+2});
            }
            if(xx-1>=0 && xx-1<l && yy+2 >=0 && yy+2<l && map[xx-1][yy+2]==0){
                map[xx-1][yy+2] = map[xx][yy]+1;
                q.offer(new int[] {xx-1, yy+2});
            }
            
            if(xx-2>=0 && xx-2<l && yy+1 >=0 && yy+1<l && map[xx-2][yy+1]==0){
                map[xx-2][yy+1] = map[xx][yy]+1;
                q.offer(new int[] {xx-2, yy+1});
            }
            if(xx-2>=0 && xx-2<l && yy-1 >=0 && yy-1<l && map[xx-2][yy-1]==0){
                map[xx-2][yy-1] = map[xx][yy]+1;
                q.offer(new int[] {xx-2, yy-1});
            }
            if(xx+1>=0 && xx+1<l && yy-2 >=0 && yy-2<l && map[xx+1][yy-2]==0){
                map[xx+1][yy-2] = map[xx][yy]+1;
                q.offer(new int[] {xx+1, yy-2});
            }
            if(xx-1>=0 && xx-1<l && yy-2 >=0 && yy-2<l && map[xx-1][yy-2]==0){
                map[xx-1][yy-2] = map[xx][yy]+1;
                q.offer(new int[] {xx-1, yy-2});
            }
            
            
        }
        return -1;
    }
    
}
