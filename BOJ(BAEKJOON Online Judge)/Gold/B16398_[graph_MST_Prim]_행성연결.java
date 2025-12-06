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
            this.to = to;
            this.w = w;
        }

        @Override
        public int compareTo(Node o){
            return this.w - o.w;
        }
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        g = new ArrayList<>();
        for(int i=0; i<=N; i++){
            g.add(new ArrayList<>());
        }

        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<i; j++){
                int val = Integer.parseInt(st.nextToken());
                g.get(i).add(new Node(j, val));
                g.get(j).add(new Node(i, val));
            }
        }

        long result = prim(1);
        System.out.print(result);
    }

    public static long prim(int s){
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.offer(new Node(s, 0));
        boolean[] visited = new boolean[N+1];
        long val = 0;
        int count = 0;
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
            if(count == N){
                break;
            }
        }
        return val;
    }

    
}
