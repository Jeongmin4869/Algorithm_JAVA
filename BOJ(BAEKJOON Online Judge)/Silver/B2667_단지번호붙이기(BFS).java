import java.util.*;
import java.io.*;

class Main_B2667 {
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int N;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        visited = new boolean[N][N];
        for(int i=0; i<N; i++){
            String str = br.readLine();
            for(int j=0; j<N; j++){
                if(str.charAt(j) == '1') map[i][j] = 1;
            }
        }

        List<Integer> list = new ArrayList<>();
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(map[i][j] == 1 && !visited[i][j]){
                    list.add(bfs(i, j));
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
        
    }

    public static int bfs(int x, int y){
        Queue<int[]> q = new LinkedList<>();
        visited[x][y] = true;
        int count = 1;
        q.offer(new int[] {x, y});
        while(!q.isEmpty()){
            int[] node = q.poll();
            int qx = node[0];
            int qy = node[1];
            for(int i=0; i<4; i++){
                int xx = dx[i] + qx;
                int yy = dy[i] + qy;
                if(xx>=0 && xx<N && yy>=0 && yy<N && !visited[xx][yy] && map[xx][yy]==1){
                    visited[xx][yy] = true;
                    count += 1;
                    q.offer(new int[] {xx, yy});
                }
            }
        }
        return count;
    }
}
