import java.util.*;
import java.io.*;

class Main_B11725 {
    static int N;
    static ArrayList<ArrayList<Integer>> list;
    static int[] parent ;
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        parent = new int[N+1];
        visited = new boolean[N+1];
        list = new ArrayList<>();
        for(int i=0; i<=N; i++){
            list.add(new ArrayList<Integer>());
        }

        StringTokenizer st;
        for(int i=0; i<N-1; i++){
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            list.get(u).add(v);
            list.get(v).add(u);
        }

        //dfs(1);
        bfs(i);
        
        StringBuilder sb = new StringBuilder();        

        for(int i=2; i<=N; i++){
            sb.append(parent[i]).append("\n");
        }

        System.out.println(sb);
    }

    public static void dfs(int node){
        visited[node] = true;
        for(int i=0; i<list.get(node).size(); i++){
            int newnode = list.get(node).get(i);
            if(!visited[newnode]){
                visited[newnode] = true;
                parent[newnode] = node;
                dfs(newnode);
            }
        }
    }

    public static void bfs(int node){
        visited[node] = true;
        Queue<Integer> q = new LinkedList<>();
        q.offer(node);
        while(!q.isEmpty()){
            int now = q.poll();
            for(int i=0; i<list.get(now).size(); i++){
                int newnode = list.get(now).get(i);
                if(!visited[newnode]){
                    visited[newnode] = true;
                    parent[newnode] = now;
                    q.offer(newnode);
                }
            }
        }
    }
}
