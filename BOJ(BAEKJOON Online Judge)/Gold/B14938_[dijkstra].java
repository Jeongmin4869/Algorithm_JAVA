import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    static int N, M, R;
    
    static ArrayList<ArrayList<Node>> g;

    static class Node implements Comparable<Node>{
        int to, c;
        Node(int to, int c){
            this.to = to;
            this.c = c;
        }

        public int compareTo(Node o){
            return this.c - o.c;
        }
        
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());

        int[] items = new int[N+1];

        st = new StringTokenizer(br.readLine());
        for(int i=1; i<=N; i++){
            items[i] = Integer.parseInt(st.nextToken());
        }

        g = new ArrayList<>();
        for(int i=0; i<=N; i++){
            g.add(new ArrayList<>());
        }
        
        for(int i=0; i<R; i++){
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            g.get(u).add(new Node(v, c));
            g.get(v).add(new Node(u, c));
        }

        int result = 0;
        for(int i=1; i<=N; i++){
            int[] dist = dijkstra(i);
        
            int sum = 0;
            for(int j=1; j<=N; j++){
                if(dist[j]<=M) sum += items[j];
            }
            result = Math.max(result, sum);
        }

        System.out.print(result);
        
    }

    public static int[] dijkstra(int s){
        int INF = Integer.MAX_VALUE;
        int[] dist = new int[N+1];
        Arrays.fill(dist, INF);
        dist[s] = 0;
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.offer(new Node(s, 0));
        while(!pq.isEmpty()){
            Node top = pq.poll();
            if(top.c > dist[top.to]) continue;
            for(Node newnode : g.get(top.to)){
                int cost = dist[top.to] + newnode.c;
                if(cost<dist[newnode.to]){
                    dist[newnode.to] = cost;
                    pq.offer(new Node(newnode.to, cost));
                }
            }
        }
        return dist;
    }
}
