import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    static int N;
    static ArrayList<ArrayList<Node>> g;
    static class Node implements Comparable<Node>{
        int to, w;
        Node(int to, int w){
            this.to=to;
            this.w = w;
        }

        @Override
        public int compareTo(Node o){
            return this.w-o.w;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        g = new ArrayList<>();
        for(int i=0; i<=N; i++){
            g.add(new ArrayList<>());
        }

        for(int i=1; i<=N; i++){
            int cost = Integer.parseInt(br.readLine());
            g.get(0).add(new Node(i, cost));
            g.get(i).add(new Node(0, cost));
        }

        for(int i=1; i<=N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=1; j<i; j++){
                int cost = Integer.parseInt(st.nextToken());
                g.get(j).add(new Node(i, cost));
                g.get(i).add(new Node(j, cost));
            }
        }

        int result = prim(0);
        System.out.println(result);
    }

    public static int prim(int s){
        PriorityQueue<Node> pq = new PriorityQueue<>();
        boolean[] visited = new boolean[N+1];
        pq.offer(new Node(s, 0));
        int count =0;
        int val = 0;
        while(!pq.isEmpty()){
            Node top = pq.poll();
            if(visited[top.to])
                continue;

            visited[top.to] = true;
            count += 1;
            val += top.w;

            for(Node node : g.get(top.to)){
                if(!visited[node.to]){
                    pq.offer(node);
                }
            }

            if(count == N+1) break;
            
        }
        return val;
    }
}
