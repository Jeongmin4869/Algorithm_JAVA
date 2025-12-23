import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    static int N;
    static ArrayList<ArrayList<Node>> g;

    static class Node {
        int to;
        int isup;
        Node(int to, int isup){
            this.to = to;
            this.isup = isup;
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

        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            g.get(u).add(new Node(v, w));
            g.get(v).add(new Node(u, w));
        }

        int max = prim(0, true);
        int min = prim(0, false);

        System.out.print(max*max - min*min);
    }

    public static int prim(int s, boolean worst){
        boolean[] visited = new boolean[N+1];
        PriorityQueue<Node> pq;
        if(worst){
            pq = new PriorityQueue<>((o1, o2)->{return o2.isup - o1.isup;});
        }
        else {
            pq = new PriorityQueue<>((o1, o2)->{return o1.isup - o2.isup;});
        }
        
        pq.offer(new Node(s, 0));
        int count = 0;
        int uphill = 0;
        while(!pq.isEmpty()){
            Node top = pq.poll();
            if(visited[top.to])
                continue;

            uphill += top.isup;
            count += 1;
            visited[top.to] = true;

            for(Node node : g.get(top.to)){
                if(!visited[node.to]){
                    pq.offer(node);
                }
            }
            if(count == N+1) break;
        }
        return uphill;
    }
}
