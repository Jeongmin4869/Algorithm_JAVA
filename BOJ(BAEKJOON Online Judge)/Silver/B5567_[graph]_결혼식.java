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

        visited = new boolean[M+1];
        int result = bfs(1);

        visited = new boolean[M+1];
        result = dfs(1, 1);
        
        System.out.println(result);
    }

    // 통과 못함 
    public static int dfs(int node, int dep){
        if(dep > 2) return 0;
        int count = 0;
        
        for(int newnode : g.get(node)){
            if(!visited[newnode]){
                visited[newnode] = true;
                count += 1;
                count += dfs(newnode, dep + 1);
            }
        }

        return count;
    }
    
    public static int bfs(int node){
        Queue<int[]> q = new LinkedList<>();
        visited[node] = true;
        q.offer(new int[] {node, 1});
        int count = 0;
        
        while(!q.isEmpty()){
            int[] top = q.poll();
            int now = top[0];
            int dep = top[1];
            
            for(int newnode : g.get(now)){
                if(!visited[newnode] && dep <= 2){
                    visited[newnode] = true;
                    count += 1;
                    q.offer(new int[] {newnode, dep+1});
                }
            }
        }
        return count;
    }
}
