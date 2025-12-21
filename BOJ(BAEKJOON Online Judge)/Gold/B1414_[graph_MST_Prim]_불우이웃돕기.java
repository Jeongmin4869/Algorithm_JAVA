import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    static int N;
    static int INF = Integer.MAX_VALUE;
    static String[] gender;
    static ArrayList<ArrayList<Node>> g;

    static class Node implements Comparable<Node>{
        int to, w;
        Node(int to, int w){            
            this.to = to;
            this.w = w;
        }

        @Override
        public int compareTo(Node o){
            return this.w - o.w;
        }
    }
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        
        N = Integer.parseInt(br.readLine());

        g = new ArrayList<>();        
        for(int i=0; i<=N; i++){
            g.add(new ArrayList<>());            
        }

        int total = 0;
        int[][] arr = new int[N+1][N+1];

        for(int i=0; i<=N; i++){
            Arrays.fill(arr[i], INF);
        }        
        
        for(int i=0; i<N; i++){
            String str = br.readLine();
            for(int j=0; j<N; j++){
                char c = str.charAt(j);
                if(c == '0') continue;
                int len = 0;
                if('a'<=c && c<='z') len = (int)(c-'a')+1;
                if('A'<=c && c<='Z') len = (int)(c-'A')+27;
                arr[i+1][j+1] = Math.min(arr[i+1][j+1], len);
                arr[j+1][i+1] = Math.min(arr[j+1][i+1], len);
                total += len;
            }
        }

        for(int i=1; i<=N; i++){
            for(int j=1; j<i; j++){
                if(arr[i][j] == INF) continue;
                g.get(i).add(new Node(j, arr[i][j]));
                g.get(j).add(new Node(i, arr[i][j]));
            }
        }

        int result = prim(1);        
        if(result >= 0) System.out.print(total - result);
        else System.out.print(-1);
        
    }

    public static int prim(int s){
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.offer(new Node(s, 0));
        boolean[] visited = new boolean[N+1];
        int count = 0;
        int val = 0;        
        while(!pq.isEmpty()){
            Node top = pq.poll();
            
            if(visited[top.to])
                continue;

            count += 1;
            val += top.w;            
            visited[top.to] = true;

            for(Node node: g.get(top.to)){
                if(!visited[node.to]){
                    pq.offer(node);
                }
            }

            if(count == N)
                return val;
        }
        return -1;
    }
}
