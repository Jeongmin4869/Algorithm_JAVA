import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    static int N, M;
    static char[][] map;
    static boolean[] check;
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new char[N][M];
        for(int i=0; i<N; i++){
            String str = br.readLine();
            for(int j=0; j<M; j++){
                map[i][j] = str.charAt(j);
            }
        }

        check = new boolean[27];

        int result = bfs(0, 0);
        
        System.out.println(result);
    }

    public static int bfs(int x, int y){
        check[map[x][y]-'A'] = true;
        int count = 0;
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
                if(xx>=0 && xx<N && yy>=0 && yy<M && !check[map[xx][yy]-'A']){
                    check[map[xx][yy]-'A'] = true;
                    q.offer(new int[]{xx, yy});
                }
            }
        }
        return count;
    }
}
