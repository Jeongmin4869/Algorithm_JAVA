import java.util.*;
import java.io.*;
class Main_B2178 {
    static int N, M;
    static boolean[][] visited;
    static int[][] map;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int count = 0;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        visited = new boolean[N][M];
        for(int i=0; i<N; i++){
            char[] c = br.readLine().toCharArray();
            for(int j=0; j<M; j++){
            map[i][j] = c[j]-'0';
            }
        }
        bfs(0,0,1);
        System.out.println(map[N-1][M-1]);
        br.close();
    }

    static void bfs(int x, int y, int count){
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[] {x, y});

        while(!q.isEmpty()){
            int[] arr = q.poll();
            int qx = arr[0];
            int qy = arr[1];

            for(int i=0; i<4; i++){
                int xx = dx[i]+qx;
                int yy = dy[i]+qy;
                if(xx<0 || xx>=N || yy<0 || yy>=M ) continue;
                if(visited[xx][yy]||map[xx][yy]==0) continue;

                q.offer(new int[] {xx, yy});
                visited[xx][yy] = true;
                map[xx][yy] = map[qx][qy]+1;
            }
        }
    }
}
