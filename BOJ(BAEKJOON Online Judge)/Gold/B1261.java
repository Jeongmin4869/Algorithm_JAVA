import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    static int N, M;
    static int[] dx = {1, 0, -1,0};
    static int[] dy = {0, 1, 0, -1};
    static int[][] map;
    static ArrayList<ArrayList>> g;
    static class Node implements Comparable<Node>{
        int x,y, c;
        Node(int x, int y, int c){
            this.x = x;
            this.y = y;
            this.c =c;
        }

        public int compareTo(Node o){
            return this.c - o.c;
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = br.readLine(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new int[N+1][M+1];

        for(int i=1; i<=N; i++){
            String str = br.readLine(br.readLine());
            for(int j=1; j<=M; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int[][] dist = dijkstra();

        System.out.print(dist[N][M])
    }

    public static int[][] dijkstra(){
        int[][] dist = new int[N+1][M+1];
        int INF = Integer.MAX_VALUE;
        for(int i=0; i<=N; i++){
            Arrays.fill(dist[i], INF);
        }

        PriorityQueue<Node> pq = new PriorityQueue<>();
        

            



            

    }
}
