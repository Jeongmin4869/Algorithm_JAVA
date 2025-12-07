import java.util.*;
import java.lang.*;
import java.io.*;

class Main {

    static int N;
    static int[] parent;

    static class Point {
        int num;
        double x, y;
        Point(int num, double x, double y){
            this.num = num;
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
        int N = Integer.parseInt(br.readLine());

        parent = new int[N+1];
        for(int i=0; i<=N; i++){
            parent[i] = i;
        }
        
        Point[] point = new Point[N];
        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            double a = Double.parseDouble(st.nextToken());
            double b = Double.parseDouble(st.nextToken());
            point[i] = new Point(i, a, b);
        }

        List<Node> edge = new ArrayList<>();
        for(int i=0; i<N; i++){
            for(int j=0; j<i; j++){
                double dis = getDistance(point[i], point[j]);
                edge.add(new Node(i, j, dis));
            }
        }

        Collections.sort(edge);

        double val = 0;
        int count = 0;
        for(Node node : edge){
            if(find(node.u) != find(node.v)){
                union(node.u, node.v);
                val += node.w;
                count += 1;
            }
            if(count == N-1) break;
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

    public static double getDistance(Point a, Point b){
        return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
    }
}
