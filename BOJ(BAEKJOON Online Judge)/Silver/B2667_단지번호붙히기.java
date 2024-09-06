import java.util.*;
import java.io.*;

class Main_B2667 {
    static boolean[][] visited;
    static char[][] g;
    static int N;
    static int count;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        visited=new boolean[N][N];
        g=new char[N][N];
        for(int i=0; i<N; i++){
            g[i] = br.readLine().toCharArray();
        }

        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(g[i][j]=='1'&&!visited[i][j]){
                    count = 0;
                    dfs(i, j);
                    list.add(count);
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        Collections.sort(list);
        sb.append(list.size()).append("\n");
        for(int i=0; i<list.size(); i++){
            sb.append(list.get(i)).append("\n");
        }
        System.out.println(sb);
        br.close();
    }

    public static void dfs(int x, int y){
        count += 1;
        visited[x][y] = true;
        for(int i=0; i<4; i++){
            int xx = x + dx[i];
            int yy = y+dy[i];
            if(xx<0 || xx >= N || yy<0 || yy >= N)
                continue;
            if(g[xx][yy]=='1'&&!visited[xx][yy]){
                dfs(xx, yy);
            }
        }
    }
}
