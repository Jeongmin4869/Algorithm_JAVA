import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    static int N, E, V1, V2;
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
        
        int result = bfs();

        System.out.print(result);
    }

    public static int bfs(){
        PriorityQueue<Node> pq = new PriorityQueue<>();
        boolean[] visited = new boolean[N+1];
        pq.offer(new Node(V1, 0));
        int sum = 0;
        while(!pq.isEmpty()){
            Node node = pq.poll();
            visited[node.to] = true;
            sum += node.val;
            for(Node newnode : g.get(node.to)){
                if(!visited[newnode.to]){
                    pq.offer(newnode);
                }
            }
        }
        return sum;
    }
}
