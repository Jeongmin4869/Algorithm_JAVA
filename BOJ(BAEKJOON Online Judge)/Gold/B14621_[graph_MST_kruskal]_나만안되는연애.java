import java.util.*;
import java.io.*;

class Main {
    static String[] gender;
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

        parent = new int[N+1];
        gender = new String[N+1];
        st = new StringTokenizer(br.readLine());
        for(int i=1; i<=N; i++){            
            gender[i] = st.nextToken();
            parent[i] = i;
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
        long val = 0;
        for(Node node : edge){

            if(gender[node.u].equals(gender[node.v]))
                continue;
            
            if(find(node.u) != find(node.v)){
                union(node.u, node.v);
                val += node.w;
                count += 1;
            }

            if(count == N-1) {
                System.out.println(val);
                return;
            }
        }
        
        System.out.println(-1);
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
