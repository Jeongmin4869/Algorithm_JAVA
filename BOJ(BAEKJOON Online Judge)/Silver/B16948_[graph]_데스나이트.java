import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    static int N;
    static boolean[][] visited;
    static int[] dx = {2, 2, 0, 0, -2, -2};
    static int[] dy = {1, -1, 2, -2, 1, -1};

    static class Pos{
        int x;
        int y;
        int dep;
        Pos(int x, int y, int dep){
            this.x = x;
            this.y = y;
            this.dep = dep;
        }
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        visited = new boolean[N][N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        int sx = Integer.parseInt(st.nextToken());
        int sy = Integer.parseInt(st.nextToken());
        int ex = Integer.parseInt(st.nextToken());
        int ey = Integer.parseInt(st.nextToken());

        int result = 0;
        result = bfs(sx, sy, ex, ey);
        
        System.out.println(result);
    }

    public static int bfs(int sx, int sy, int ex, int ey){
        
        visited[sx][sy] = true;
        Queue<Pos> q = new LinkedList<>();
        q.offer(new Pos(sx, sy, 0));
        while(!q.isEmpty()){
            Pos top = q.poll();
            if(top.x == ex && top.y == ey)
                return top.dep;

            for(int i=0; i<6; i++){
                int xx = top.x + dx[i];
                int yy = top.y + dy[i];
                if(xx>=0 && xx<N && yy>=0 && yy<N && !visited[xx][yy]){
                    visited[xx][yy] = true;
                    q.offer(new Pos(xx, yy, top.dep + 1));
                }
            }
        }
        return -1;
    }
}
