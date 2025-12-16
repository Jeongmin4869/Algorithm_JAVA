import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    static int N ;
    static ArrayList<ArrayList<Node>> g;

    static class Node implements Comparable<Node>{
        int to, w;
        Node(int to, int w){
            this.to = to;
            this.w = w;
        }

        @Override
        public int compareTo(Node o){
            return this.w - o.w;
        }
        
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        PriorityQueue<Node> pq = new PriorityQueue<>();
        st = new StringTokenizer(br.readLine());
        
        for(int i=0; i<K; i++){
           int num = Integer.parseInt(st.nextToken());
           pq.offer(new Node(num, 0));
        }

        g = new ArrayList<>();
        for(int i=0; i<=N; i++){
            g.add(new ArrayList<>());
        }

        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            g.get(u).add(new Node(v, w));
            g.get(v).add(new Node(u, w));
        }

        int result = prim(pq);
        
        System.out.println(result);
    }

    public static int prim(PriorityQueue<Node> pq){
        boolean[] visited = new boolean[N+1];
        int count = 0;
        int val = 0;
        while(!pq.isEmpty()){
            Node top = pq.poll();
            if(visited[top.to])
                continue;

            visited[top.to] = true;
            val += top.w;
            count += 1;

            for(Node node : g.get(top.to)){
                if(!visited[node.to]){
                    pq.offer(node);
                }
            }

            if(count == N) break;
        }

        return val;
    }
}
