import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    static int[] parent;;
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, -1, 0, 1};
    static int N, M;

    static class Node implements Comparable<Node>{
        int u, v, w;
        Node(int u, int v, int w){
            this.u = u;
            this.v = v;
            this.w = w;
        }

        @Override
        public int compareTo(Node o){
            return this.w - o.w;
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M  = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        visited = new boolean[N][M];
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<M; j++){
                int num = Integer.parseInt(st.nextToken());
                map[i][j] = num;
            }
        }

        int idx = 1;
        for(int i=0; i<N; i++){
            
            for(int j=0; j<M; j++){
                if(map[i][j] == 1 && !visited[i][j]){
                    dfs(i, j, idx);
                    idx += 1;
                }
            }
        }

        
        System.out.println("Hello world!");
    }

    public static void dfs(int x, int y, int num){
        visited[x][y] = true;
        map[x][y] = num;
        for(int i=0; i<4; i++){
            int xx = x + dx[i];
            int yy = y + dy[i];
            if(xx>=0 && xx<N && yy>=0 && yy<M && !visited[xx][yy] && map[xx][yy]==1){
                dfs(xx, yy, num);
            }
        }
    }
}
