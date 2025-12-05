import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    static int N;
    static int[] parent ;
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
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        parent = new int[N+1];
        ArrayList<Node> edge = new ArrayList<>();
        
        for(int i=0; i<=N; i++){
            parent[i] = i;
        }

        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<=i; j++){
                if(i==j) continue;
                int w = Integer.parseInt(st.nextToken());
                edge.add(new Node(i, j, w));
            }
        }

        Collections.sort(edge);

        int count = 0;
        int val = 0;
        for(Node node : edge){
            int a = find(node.u);
            int b = find(node.v);
            if(a!=b){
                union(node.u, node.v);
                count += 1;
                val += node.w;
            }
            if(count == N-1)
                break;
        }

        System.out.print(val);
    }

    public static int find(int x){
        if(x==parent[x]) return x;
        return parent[x] = find(parent[x]);
    }

    public static void union(int a, int b){
        a = find(a);
        b = find(b);
        if(a!=b) parent[b] = a;
    }
}
