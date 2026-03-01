import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {

    static int N, M, A, B;
    static int[] prev;
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

        prev = new int[N+1];
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
            //g.get(v).add(new Node(u, c));
        }

        st  = new StringTokenizer(br.readLine());
        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());

        int[] diff = dijkstra(A);

        int cur = B;
        List<Integer> list = new ArrayList<>();
        while(cur>0){
            list.add(cur);
            cur = prev[cur];
        }

        System.out.println(diff[B]);
        System.out.println(list.size());

        Collections.reverse(list);

        for(int n : list){
            System.out.print(n + " ");
        }

        
    }

    public static int[] dijkstra(int s){
        int INF = Integer.MAX_VALUE;
        int[] dist = new int[N+1];
        Arrays.fill(dist, INF);
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.offer(new Node(s, 0));
        dist[s] = 0;
        while(!pq.isEmpty()){
            Node node = pq.poll();
            if(node.c > dist[node.to]) continue;
            for(Node newnode : g.get(node.to)){
                int cost = dist[node.to] + newnode.c;
                if(cost < dist[newnode.to]){
                    dist[newnode.to] = cost;
                    prev[newnode.to] = node.to;
                    pq.offer(new Node(newnode.to, cost));
                }
            }
        }
        return dist;
    }
}
