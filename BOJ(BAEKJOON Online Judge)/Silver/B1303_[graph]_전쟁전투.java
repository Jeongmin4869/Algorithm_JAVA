import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    static int N, M;
    static char[][] map;
    static boolean[][] visited;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, -1, 0, 1};
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new char[M][N];
        visited = new boolean[M][N];
        for(int i=0; i<M; i++){
            String str = br.readLine().toString();
            for(int j=0; j<N; j++){
                map[i][j] = str.charAt(j);
            }
        }

        int wc = 0;
        int bc = 0;
        for(int i=0; i<M; i++){
            for(int j=0; j<N; j++){
                if(!visited[i][j]){
                    char c = map[i][j];
                    int cnt = bfs(i, j, c);
                    if(c == 'B') bc += cnt*cnt;
                    if(c == 'W') wc += cnt*cnt;
                }
            }
        }
        System.out.println(wc + " " + bc);
    }

    public static int bfs(int x, int y, char c){
        int count = 0;
        visited[x][y] = true;
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{x, y});
        while(!q.isEmpty()){
            int[] pos = q.poll();
            int px = pos[0];
            int py = pos[1];
            count += 1;
            for(int i=0; i<4; i++){
                int xx = px + dx[i];
                int yy = py + dy[i];
                if(xx>=0&&xx<M&&yy>=0&&yy<N&&!visited[xx][yy] && map[xx][yy] == c){
                    visited[xx][yy] = true;
                    q.offer(new int[]{xx, yy});
                    
                }
            }
        }
        return count;
        
    }
}
