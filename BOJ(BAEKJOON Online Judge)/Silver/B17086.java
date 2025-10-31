import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    static int N, M;
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {1,1,1,0,0,-1,-1,-1};
    static int[] dy = {1,0,-1,1,-1,1,0,-1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M]; 
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<M; j++){
                num = Integer.parseInt(st.nextToken());
                map[i][j] = num;
            }
        }

        int count = 0;
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                
                if(map[i][j] == 0) {
                    int c = bfs(i, j);
                    count = Math.max(count, c);
                }
            }
        }
        System.out.println(count);
    }

    public static int bfs(int x, int y){
        
        visited = new boolean[N][M];
        visited[x][y] = true;
        Queue<int[]> q = LinkedList<>();
        q.offer(new int[]{x, y, 0});
        while(!q.isEmpty()){
            int[] pos =  q.poll();
            int xx = pos[0];
            int yy = pos[1];
            int dep = pos[2];
            for(int i=0; i<8; i++){
                
            }
        }
    }
}
