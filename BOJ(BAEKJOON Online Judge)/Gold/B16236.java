import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    static int level = 2;
    static int N;
    static int[][] map;
    static int[] dx = {-1, 0, 0, 1};
    static int[] dy = {0, -1, 1, 0};
    
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        map= new int[N][N];

        int x=0, y=0;
        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
                if(map[i][j] == 9){
                    x = i;
                    y = j;
                }
            }
        }

        int result = bfs(x, y);

        System.out.print(result);
    }

    static int bfs(int x, int y){
        Queue<int[]> q = new LinkedList<>();
        int time =-1;
        int result = 0;
        int eat = 0;
        q.offer(new int[]{x, y});
        while(!q.isEmpty()){
            time += 1;
            int[] top = q.poll();
            int px = top[0];
            int py = top[1];
            if(map[px][py]!=0 && map[px][py] < level){
                eat += 1;
                map[px][py] = 0;
                result += time;
                time = 0;
                if(eat == level){
                    eat = 0;
                    level += 1;
                }
            }

            for(int i=0; i<4; i++){
                int xx = px + dx[i];
                int yy = py + dy[i];
                if(xx>=0 && xx<N && yy>=0 && yy<N){
                    q.offer(new int[]{xx, yy});
                }
            }
        }
        return result;
    }
}
