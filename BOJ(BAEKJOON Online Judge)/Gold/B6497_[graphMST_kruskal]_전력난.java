import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {

    static int[] parent;

    static class Node implements Comparable<Node>{
        int u, v, w;
        Node(int u, int v, int w){
            this.u=u;
            this.v=v;
            this.w=w;
        }
        @Override
        public int compareTo(Node o){
            return this.w - o.w;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            if(N == 0 && M == 0)
                break;

            parent = new int[N];
            for(int i=1; i<N; i++){
                parent[i] = i;
            }

            int totalval = 0;
            List<Node> edge = new ArrayList<>();
            for(int i=0; i<M; i++){
                st = new StringTokenizer(br.readLine());
                int u = Integer.parseInt(st.nextToken());
                int v = Integer.parseInt(st.nextToken());
                int w = Integer.parseInt(st.nextToken());
                totalval += w;
                edge.add(new Node(u, v, w));
            }

            Collections.sort(edge);

            int val = 0;
            int count = 0;

            for(Node node : edge){
                if(find(node.u)!=find(node.v)){
                    val += node.w;
                    union(node.u, node.v);
                    count += 1;
                }
                if(count == N-1) break;
            }

            System.out.println(totalval - val);
            
        }
        
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
