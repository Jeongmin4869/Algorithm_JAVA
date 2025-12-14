import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    static int N;
    static String[] gender;
    static ArrayList<ArrayList<Node>> g;

    static class Node implements Comparable<Node>{
        int from, to, w;
        Node(int from, int to, int w){
            this.from = from;
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

        g = new ArrayList<>();        
        for(int i=0; i<=N; i++){
            g.add(new ArrayList<>());            
        }

        gender = new String[N+1];
        gender[0] = "";
        st = new StringTokenizer(br.readLine());
        for(int i=1; i<=N; i++){
            gender[i] = st.nextToken();   
        }
        
        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            g.get(u).add(new Node(0, v, w));
            g.get(v).add(new Node(0, u, w));
        }

        int result = prim(1);

        System.out.print(result);
    }

    public static int prim(int s){
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.offer(new Node(0, s, 0));
        boolean[] visited = new boolean[N+1];
        int count = 0;
        int val = 0;        
        while(!pq.isEmpty()){
            Node top = pq.poll();
            
            if(gender[top.from].equals(gender[top.to]))
                continue;

            if(visited[top.to])
                continue;

            count += 1;
            val += top.w;            
            visited[top.to] = true;

            for(Node node: g.get(top.to)){
                if(!visited[node.to]){
                    pq.offer(new Node(top.to, node.to, node.w));
                }
            }

            if(count == N)
                return val;
        }
        return -1;
    }
}
