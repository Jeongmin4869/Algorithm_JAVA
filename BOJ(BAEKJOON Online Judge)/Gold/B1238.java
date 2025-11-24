import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    static int N, M, X;
    static ArrayList<ArrayList<Node>> g;

    static class Node implements Comparable<Node>{
        int to;
        int val;
        public Node(int to, int val){
            this.to = to;
            this.val = val;
        }

        @Override
        public int compareTo(Node n){
            return this.val-n.val;
        } 
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        g = new ArrayList<>();
        for(int i=0; i<=N; i++){
            g.add(new ArrayList<>());
        }

        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int dep = Integer.parseInt(st.nextToken());
            g.get(u).add(new Node(v, dep));
            g.get(v).add(new Node(u, dep));
        }

        int result = dijkstra(N);

        System.out.print(result);
    }

    public static int dijkstra(int s){
        PriorityQueue<Node> pq = new PriorityQueue<>();
        int[] dist = new int[N+1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        pq.offer(new Node(s, 0));
        dist[s] = 0;
        while(!pq.isEmpty()){
            Node node = pq.poll();
            if(dist[node.to] < node.val){
                continue;
            }
            for(Node next : g.get(node.to)){
                int cur = next.val + node.val;
                if(cur < dist[next.to]){
                    dist[next.to] = cur;
                    pq.offer(new Node(next.to, cur));
                }
            }
        }

        int result = 0;
        for(int i=1; i<=N; i++){
            result = Math.max(result, dist[i]);
        }
        return result*2;
        
    }
}
