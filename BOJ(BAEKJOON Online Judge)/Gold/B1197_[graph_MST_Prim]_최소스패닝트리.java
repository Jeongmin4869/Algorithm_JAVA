import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {

    static int N;
    static ArrayList<ArrayList<Node>> g;
    static class Node implements Comparable<Node>{
        int to, val;
        Node(int to, int val){
            this.to = to;
            this.val = val;
        }

        @Override
        public int compareTo(Node o){
            return this.val - o.val;
        }
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

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

        int result = prim(1);

        System.out.print(result);
    }

    public static int prim(int s){
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.offer(new Node(s, 0));
        int total = 0;
        int count = 0;
        boolean[] visited = new boolean[N+1];
        while(!pq.isEmpty()){
            Node top = pq.poll();
            if(visited[top.to]) continue;
            count += 1;
            total += top.val;
            visited[top.to] = true;
            for(Node node : g.get(top.to)){
                if(!visited[node.to]){
                    pq.offer(node);
                }
            }
            if(count == N) break;
        }
        return total;
    }
}
