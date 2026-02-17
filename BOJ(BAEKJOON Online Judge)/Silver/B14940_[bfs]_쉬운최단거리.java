import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    static int N, M;
    static int[] dx = {1,0,-1,0};
    static int[] dy = {0, 1, 0, -1};
    static int[][] map;
    static int[][] visited;
    
    static class Node{
        int x, y, dis;
        Node(int x, int y, int dis){
            this.x = x;
            this.y = y;
            this.dis = dis;
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        visited = new int[N][M];
        int x=0;
        int y=0;
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<M; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
                if(map[i][j]==2){
                    x = i;
                    y = j;
                }
            }
        }

        bfs(x, y);

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(map[i][j] == 0) sb.append("0 ");
               else sb.append(visited[i][j]).append(" ");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }

    public static void bfs(int x, int y){
        for(int i=0; i<N; i++){
            Arrays.fill(visited[i], -1);
        }

        Queue<Node> q = new LinkedList<>();
        q.offer(new Node(x,y,0));
        visited[x][y] = 0;
        while(!q.isEmpty()){
            Node node = q.poll();
            int px = node.x;
            int py = node.y;
            int dis = node.dis;

            for(int i=0; i<4; i++){
                int xx = px + dx[i];
                int yy = py + dy[i];
                if(xx>=0&&xx<N&&yy>=0&&yy<M&&map[xx][yy]!=0&&visited[xx][yy]==-1){
                    visited[xx][yy] = dis+1;
                    q.offer(new Node(xx, yy, dis+1));
                }
            }
        }
    }
}
