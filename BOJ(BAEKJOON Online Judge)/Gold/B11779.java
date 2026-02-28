import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {

    static int N, M, A, B;
    static int[] check;
    static ArrayList<ArrayList<Node>> g;

    static class Node implements Comparable<Node>{
        int to, c;
        Node(int to, int c){
            this.to = to;
            this.c = c;
        }

        public int compareTo(Node n){
            return this.c - n.c;
        }
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());

        check = new int[N+1];
        g = new ArrayList<>();

        for(int i=0; i<=N; i++){
            g.add(new ArrayList<>());
        }

        StringTokenizer st;
        for(int i=0; i<M; i++){
            st  = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            g.get(u).add(new Node(v, c));
            g.get(v).add(new Node(u, c));
        }

        st  = new StringTokenizer(br.readLine());
        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
        
        System.out.println("Hello world!");
    }

    public static int[] dijkstra(int s){
        int INF = 1000000;
        int[] dist = new int[N+1];
        Arrays.fill(dist, INF);
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.offer(new Node(s, 0));
        while(!pq.isEmpty()){
            Node node = pq.poll();
            if(node.c >= dist[node.to]) continue;
            for(Node newnode : g.get(node.to)){
                int cost = dist[node.to] + newnode.c;
                if(cost < dist[newnode.to]){
                    dist[newnode.to] = cost;
                    pq.offer(new Node(newnode.to, cost));
                }
            }
        }
        return dist;

    }
}
