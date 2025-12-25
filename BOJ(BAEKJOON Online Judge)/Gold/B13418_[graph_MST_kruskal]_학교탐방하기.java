import java.util.*;
import java.io.*;

class Main {
    static int[] parent;
    
    static class Node{
        int u, v, isup;
        Node(int u, int v, int isup){
            this.u = u;
            this.v = v;
            this.isup = isup;
        }
    }
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        List<Node> edge = new ArrayList<>();
        for(int i=0; i<M+1; i++){
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int isup = Integer.parseInt(st.nextToken());
            edge.add(new Node(u, v, isup));
        }
        
        int min = kruskal(edge, N, false);
        int max = kruskal(edge, N, true);
        
        System.out.print((max*max) - (min*min));
    }

    public static void setParent(int N){
        parent = new int[N+1];
        for(int i=0; i<=N; i++){
            parent[i] = i;
        }
    }

    public static int find(int x){
        if(parent[x] == x) return x;
        return parent[x] = find(parent[x]);
    }

    public static void union(int a, int b){
        a = parent[a];
        b = parent[b];
        if(a != b) parent[b] = a;
    }

    public static int kruskal(List<Node> edge, int N, boolean worst){
        if(!worst) Collections.sort(edge, (o1, o2) -> {return o2.isup - o1.isup;});
        else       Collections.sort(edge, (o1, o2) -> {return o1.isup - o2.isup;});
        
        int count = 0;
        int val = 0;
        setParent(N);
        for(Node node : edge){
            if(find(node.u) != find(node.v)){
                count += 1;
                union(node.u, node.v);
                if(node.isup == 0) val += 1;                
            }
            if(count == N) break;
        }
        return val;
    }
}
