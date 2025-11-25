import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    static int N, M, X;
    static ArrayList<ArrayList<Node>> g;
    static ArrayList<ArrayList<Node>> rg;

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
        X = Integer.parseInt(st.nextToken());

        g = new ArrayList<>();
        rg = new ArrayList<>();
        for(int i=0; i<=N; i++){
            g.add(new ArrayList<>());
            rg.add(new ArrayList<>());
        }

        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int dep = Integer.parseInt(st.nextToken());
            g.get(u).add(new Node(v, dep));
            rg.get(v).add(new Node(u, dep));
        }

        int[] garr = dijkstra(g, X);
        int[] rgarr = dijkstra(rg, X);

        int result = 0;
        for(int i=1; i<=N; i++){
            result = Math.max(result, garr[i]+rgarr[i]);
        }

        System.out.print(result);
    }

    public static int[] dijkstra(ArrayList<ArrayList<Node>> list, int s){
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
            for(Node next : list.get(node.to)){
                int cur = next.val + node.val;
                if(cur < dist[next.to]){
                    dist[next.to] = cur;
                    pq.offer(new Node(next.to, cur));
                }
            }
        }
        return dist;
    }
}
