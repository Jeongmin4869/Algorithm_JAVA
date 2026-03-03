import java.util.*;
import java.io.*;

class Main {
    static int N, M, C;
    static ArrayList<ArrayList<Node>> g;
    static int INF = Integer.MAX_VALUE;
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
        int T = Integer.parseInt(br.readLine());
        for(int t=0; t<T; t++){

            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            C = Integer.parseInt(st.nextToken());

            g = new ArrayList<>();
            for(int i=0; i<=N; i++){
                g.add(new ArrayList<>());
            }

            for(int i=0; i<M; i++){
                st = new StringTokenizer(br.readLine());
                int u = Integer.parseInt(st.nextToken());
                int v = Integer.parseInt(st.nextToken());
                int c = Integer.parseInt(st.nextToken());
                
                g.get(v).add(new Node(u, c));
            }

            int[] dist = dijkstra(C);

            int maxT = 0;
            int count = 0;
            for(int i=1; i<=N; i++){
                if(dist[i] == INF ) continue;
                maxT = Math.max(maxT, dist[i]);
                count += 1;
            }

            System.out.println(count + " " + maxT);
            
        }

    }

    public static int[] dijkstra(int s){
        int[] dist = new int[N+1];
        Arrays.fill(dist, INF);
        dist[s] = 0;
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.offer(new Node(s, 0));
        while(!pq.isEmpty()){
            Node top = pq.poll();
            if(dist[top.to] < top.c) continue;

            for(Node newnode : g.get(top.to)){
                int cost = dist[top.to] + newnode.c;
                if(cost < dist[newnode.to]){
                    dist[newnode.to] = cost;
                    pq.offer(new Node(newnode.to, cost));
                }
            }
        }
        return dist;
    }
}
