import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    static int[] parent;
    static int[] cost;

    static class Node implements Comparable<Node>{
        int u, v, w;
        Node(int u, int v, int w){
            this.u = u;
            this.v = v;
            this.w = w;
        }
        @Override
        public int compareTo(Node o){
            return this.w - o.w;
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        cost = new int[N];
        parent = new int[N];
        for(int i=0; i<N; i++){
            cost[i] = Integer.parseInt(br.readLine());
            parent[i] = i;
        }

        List<Node> edge = new ArrayList<>();
        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<i; j++){
                int w = Integer.parseInt(st.nextToken());
                edge.add(new Node(i, j, w));
            }
        }

        Collections.sort(edge);

        int count = 0;
        int val = 0;
        for(Node e: edge){
            if(find(e.u) != find(e.v)){
                union(e.u, e.v);
                val += Math.min(e.w, cost[e.v] + cost[e.u]);
                count += 1;
            }
            if(count == N-1) break;
        }

        System.out.print(val);
    }

    public static int find(int x){
        if(parent[x]==x) return x;
        return parent[x] = find(parent[x]);
    }

    public static void union(int a, int b){
        a = find(a);
        b = find(b);
        if(a!=b) parent[b] = a;
    }
}
