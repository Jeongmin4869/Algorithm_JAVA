import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    static int M, N;
    static ArrayList<ArrayList<Integer>> g;
    static boolean[] visited;
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        M = Integer.parseInt(br.readLine());
        N = Integer.parseInt(br.readLine());
        visited = new boolean[M+1];
        g = new ArrayList<>();
        for(int i=0; i<=M; i++){
            g.add( new ArrayList<>());
        }
        
        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            g.get(u).add(v);
            g.get(v).add(u);
        }

        int result = bfs(1);
        
        System.out.println(result);
    }

    public static int bfs(int node){
        Queue<Integer> q = new LinkedList<>();
        visited[node] = true;
        q.offer(node);
        int count = 0;
        while(!q.isEmpty()){
            int now = q.poll();
            for(int newnode : g.get(now)){
                if(!visited[newnode]){
                    visited[newnode] = true;
                    count += 1;
                    if(now == newnode)
                        q.offer(newnode);
                }
            }
        }
        return count;
    }
}
