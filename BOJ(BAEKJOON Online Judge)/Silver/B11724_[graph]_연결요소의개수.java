import java.util.*;
import java.io.*;

class Main {
    static int N;
    static boolean[] visited;
    static ArrayList<ArrayList<Integer>> list;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        visited = new boolean[N+1];
        list = new ArrayList<>();
        for(int i=0; i<=N; i++){
            list.add(new ArrayList<>());
        }

        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            list.get(u).add(v);
            list.get(v).add(u);
        }

        int count = 0;
        for(int i=1; i<=N; i++){
            if(!visited[i]){
                count += 1;
                dfs(i);
            }
        }
        System.out.print(count);
    }

    public static void dfs(int node){
        visited[node] = true;
        for(int i=0; i<list.get(node).size(); i++){
            int newnode = list.get(node).get(i);
            if(!visited[newnode]){
                dfs(list.get(node).get(i));
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
                    q.offer(newnode);
                }
            }
        }
    }
}
