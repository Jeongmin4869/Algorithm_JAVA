import java.util.*;
import java.lang.*;
import java.io.*;

class Main_B1707 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        for(int i=0; i<K; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int V = Integer.parseInt(st.nextToken());
            int E = Integer.parseInt(st.nextToken());
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();

            for(int j=0; j<=V; j++){
                list.add(new ArrayList<Integer>());
            }
            
            for(int k=0; k<E; k++){
                st = new StringTokenizer(br.readLine());
                int u = Integer.parseInt(st.nextToken());
                int v = Integer.parseInt(st.nextToken());
                list.get(u).add(v);
                list.get(v).add(u);
            }

            boolean[] visited = new boolean[V+1];
            boolean result = dfs(list, 1, visited);

            if(result) System.out.println("YES");
            else System.out.println("NO");
        }        
    }

    public static boolean dfs(ArrayList<ArrayList<Integer>> list, int node, boolean[] visited){
        visited[node] = true;        
        for(int i=0; i<list.get(node).size(); i++){
            int newnode = list.get(node).get(i);
            if(visited[newnode]){
                return false;
            }
            
            if(!dfs(list, newnode, visited)){
                return false;
            }
        }
        return true;        
    }
}
