import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    static int N,M;
    static int V1, V2;
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
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        g = new ArrayList<>();
        for(int i=0; i<=N; i++){
            g.add(new ArrayList<>());
        }

        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            g.get(u).add(new Node(v,c));
            g.get(v).add(new Node(u,c));
        }

        st = new StringTokenizer(br.readLine());
        V1 = Integer.parseInt(st.nextToken());
        V2 = Integer.parseInt(st.nextToken());

        int[] dist = dijkstra(V1);

        System.out.print(dist[V2]);
        
    }

    public static int[] dijkstra(int s){
        int INF = Integer.MAX_VALUE;
        int[] dist = new int[N+1];
        Arrays.fill(dist, INF);
        dist[s] = 0;
        PriorityQueue<Node> pq=new PriorityQueue<>();
        pq.offer(new Node(s,0));
        while(!pq.isEmpty()){
            Node top = pq.poll();
            if(dist[top.to]<top.c) continue;
            for(Node newnode : g.get(top.to)){
                int cost = dist[top.to]+newnode.c;
                if(dist[newnode.to]>=cost){
                    dist[newnode.to] = cost;
                    pq.offer(new Node(newnode.to, cost));
                }
            }
        }
        return dist;
            
    }
}
