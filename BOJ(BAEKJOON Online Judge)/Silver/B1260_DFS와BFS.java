import java.util.*;
import java.io.*;

class Main_B1260 {
    static int count = 0;
    static boolean[] visited;
    static ArrayList<ArrayList<Integer>> g;
    static StringBuilder sb;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); 
        int M = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());
        
        g = new ArrayList<>();
        for(int i=0; i<=N; i++){
            g.add(new ArrayList<>());
        }

        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            g.get(u).add(v);
            g.get(v).add(u);
        }

        for(int i=1; i<=N; i++){
            Collections.sort(g.get(i));
        }
        
        count = 1;
        visited = new boolean[N+1];
        sb = new StringBuilder();
        dfs(R);
        
        sb.append("\n");
        
        count = 1;
        visited = new boolean[N+1];
        bfs(R); 
        System.out.println(sb);
        
    }

    public static void dfs(int node){
        sb.append(node + " ");
        visited[node] = true;
        for(int i=0; i<g.get(node).size(); i++){
            int newnode = g.get(node).get(i);
            if(!visited[newnode]){
                visited[newnode] = true;
                count += 1;
                dfs(newnode);
            }
        } 
    }

    public static void bfs(int node){
        sb.append(node + " ");
        visited[node] = true;
        Queue<Integer> q = new LinkedList<>();
        q.offer(node);
        while(!q.isEmpty()){
            int num = q.poll();
            for(int i=0; i<g.get(num).size(); i++){
                int newnode = g.get(num).get(i);
                if(!visited[newnode]){
                    visited[newnode] = true;
                    count += 1;
                    sb.append(newnode + " ");
                    q.offer(newnode);
                }
            }
            
        }
    }
}
