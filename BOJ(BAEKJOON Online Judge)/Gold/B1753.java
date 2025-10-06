import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    static int[] d;
    static final int INF = Integer.MAX_VALUE;

    static class Node{
        int to;
        int w;

        Node(int to, int w){
            this.to = to;
            this.w = w;
        }    
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int V = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(br.readLine());

        d = new int[V+1];
        Arrays.fill(d, INF);
        ArrayList<ArrayList<Node>> g = new ArrayList<>();
        for(int i=0; i<=V; i++){
            g.add(new ArrayList<>());
        }

        for(int i=0; i<E; i++){
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            g.get(u).add(new Node(v, w));
        }

        bfs(K, g);

        for(int i=1; i<=V; i++){
            if(d[i]==INF)
                System.out.println("INF");
            else
                System.out.println(d[i]);
        }
        
    }

    public static void bfs(int K, ArrayList<ArrayList<Node>> g){
        Queue<Integer> q = new LinkedList<>();
        q.offer(K);
        d[K] = 0;
        while(!q.isEmpty()){
            int now = q.poll();
            for(int i=0; i<g.get(now).size(); i++){
                Node newnode = g.get(now).get(i);
                int cost = d[now] + newnode.w;
                if(cost < d[newnode.to]){
                    d[newnode.to] = cost;
                    q.offer(newnode.to);
                }
            }
        }
    }

    
}
