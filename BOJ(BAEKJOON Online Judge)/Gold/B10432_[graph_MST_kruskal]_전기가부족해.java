import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    static int K;
    static int[] parent;
    
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
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        parent = new int[N+1];
        for(int i=0; i<=N; i++){
            parent[i] = i;
        }

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<K; i++){
            int idx = Integer.parseInt(st.nextToken());
            parent[idx] = 0;
        }

        List<Node> edge = new ArrayList<>();
        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            edge.add(new Node(u, v, w));
        }

        Collections.sort(edge);

        int count = 0;
        int sum = 0;
        for(Node node : edge){
            if(find(node.u)!=find(node.v)){
                union(node.u, node.v);
                count += 1;
                sum += node.w;
            }
            if(count ==N-K) break;
        }

        System.out.print(sum);
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
