import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    static int N, E, V1, V2;
    static int INF = 10000000;
    static ArrayList<ArrayList<Node>> g;

    static class Node implements Comparable<Node>{
        int to, val;
        Node(int to, int val){
            this.to=to;
            this.val=val;
        }

        public int compareTo(Node o){
            return this.val - o.val;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());

        g = new ArrayList<>();
        for(int i=0; i<=N; i++){
            g.add(new ArrayList<>());
        }

        for(int i=0; i<E; i++){
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
        
        int[] dist1 = dijkstra(1);
        int[] distV1 = dijkstra(V1);
        int[] distV2 = dijkstra(V2);

        int case1 = dist1[V1] + distV1[V2] + distV2[N];
        int case2 = dist1[V2] + distV2[V1] + distV1[N];

        int result = Math.min(case1, case2);
        if(result >= INF) System.out.print(-1);
        else System.out.print(result);
    }

    public static int[] dijkstra(int start){
        int[] dist = new int[N+1];
        Arrays.fill(dist, INF);
        dist[start] = 0;
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.offer(new Node(start, 0));
        while(!pq.isEmpty()){
            Node top = pq.poll();
            if(dist[top.to]<top.val) continue;

            for(Node newnode : g.get(top.to)){
                int d = dist[top.to]+newnode.val;
                if(dist[newnode.to] > d){
                    dist[newnode.to] = d;
                    pq.offer(new Node(newnode.to, d));
                    
                }
            }
        }

        return dist;
            
    }
}
