import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {

    static int[] parent;

    static class Pos {
        int x;
        int y;
        Pos(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    static class Node implements Comparable<Node>{
        int u, v;
        double w;
        Node(int u, int v, double w){
            this.u = u;
            this.v = v;
            this.w = w;
        }

        @Override 
        public int compareTo(Node o){
            return Double.compare(this.w, o.w);
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        parent = new int[N+1];
        for(int i=1; i<=N; i++){
            parent[i] = i;
        }

        Pos[] pos = new Pos[N+1];
        for(int i=1; i<=N; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            pos[i] = new Pos(x, y);
        }

        List<Node> edge = new ArrayList<>();
        for(int i=1; i<=N; i++){
            for(int j=1; j<i; j++){
                double dis = Math.sqrt(Math.pow(pos[i].x-pos[j].x,2) + Math.pow(pos[i].y-pos[j].y, 2));
                edge.add(new Node(i, j, dis));
            }
        }

        Collections.sort(edge);
        
        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            union(a, b);
        }

        int count = 0;
        double val = 0.0;
        for(Node node:edge){
            if(find(node.u)!=find(node.v)){
                count += 1;
                val += node.w;
                union(node.u, node.v);
            }
       
        }
        System.out.printf("%.2f", val);
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
