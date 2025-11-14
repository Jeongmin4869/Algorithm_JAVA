import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    static int N;
    static ArrayList<ArrayList<Node>> g;

    static class Node{
        int a;
        int dis;
        Node(int a, int dis ){
            this.a = a;
            this.dis = dis;
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        int T = Integer.parseInt(br.readLine());

        g = new ArrayList<>();
        for(int i=0; i<=N; i++){
            g.add(new ArrayList<>());
        }

        for(int i=0; i<T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            g.get(u).add(new Node(v, d));
        }

        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                int sum = bfs(i+1, j+1);
                System.out.print(sum + " ");
            }
            System.out.println();
        }
        
    }

    public static int bfs(int from, int to){
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[] {from, 0});
        while(!q.isEmpty()){
            int[] top = q.poll();
            int now = top[0];
            int sum = top[1];
            if(now == to) return sum;
            for(Node newnode : g.get(now)){
                q.offer(new int[]{newnode.a, sum + newnode.dis});
            }
        }
        return 0;
    }
}
