import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    static int N;
    static ArrayList<ArrayList<Node>> g;
    static class Star{
        double x, y;
        Star(double x, double y ){
            this.x = x;
            this.y = y;
        }
    }

    static class Node implements Comparable<Node>{
        int to;
        double val;

        Node(int to, double val){
            this.to = to;
            this.val = val;
        }

        @Override
        public int compareTo(Node o){
            return Double.compare(this.val, o.val);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        g = new ArrayList<>();
        for(int i=0; i<=N; i++){
            g.add(new ArrayList<>());
        }

        Star[] star = new Star[N];
        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            double a = Double.parseDouble(st.nextToken());
            double b = Double.parseDouble(st.nextToken());
            star[i] = new Star(a, b);
        }

        for(int i=0; i<N; i++){
            for(int j=0; j<i; j++){
                double dis = getDistance(star[i], star[j]);
                g.get(i).add(new Node(j, dis));
                g.get(j).add(new Node(i, dis));
            }
        }

        double result = prim(1);

        System.out.printf("%.2f", result);
        
    }

    public static double getDistance(Star a, Star b){
        return Math.sqrt(Math.pow(a.x-b.x, 2)+Math.pow(a.y-b.y, 2));
    }

    public static double prim(int s){
        boolean[] visited = new boolean[N+1];
        PriorityQueue<Node> pq= new PriorityQueue<>();
        pq.offer(new Node(s, 0.0));
        int count = 0;
        double val = 0.0;
        while(!pq.isEmpty()){
            Node top = pq.poll();
            if(visited[top.to]) 
                continue;
            visited[top.to] = true;
            val += top.val;
            count += 1;

            for(Node node:g.get(top.to)){
                if(!visited[node.to]){
                    pq.offer(node);
                }
            }
            if(count == N) break;
        }
        return val;
    }
}
