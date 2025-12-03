import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    static int N;
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
        N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        parent = new int[N+1];
        for(int i=0; i<=N; i++){
            parent[i] = i;
        }
        
        ArrayList<Node> edge = new ArrayList<>();
        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            edge.add(new Node(u, v, w));
        }

        Collections.sort(edge);

        int count = 0;
        int val = 0;
        int max = 0;
        for(Node node : edge){
            int u = node.u;
            int v = node.v;
            int w = node.w;
            if(find(u)!=find(v)){
                count += 1;
                union(u, v);
                val += w;
                max = Math.max(w, max);
            }
            if(count == N-1) break;
        }
        System.out.print(val -max);
    }

    public static int find(int x){
        if(parent[x] == x) return x;
        return parent[x] = find(parent[x]);
    }

    public static void union(int a, int b){
        a = find(a);
        b = find(b);
        if(a!=b) parent[b] = a;
    }
}
