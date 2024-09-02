import java.util.*;
import java.io.*;

class Main_B2606 {
    static boolean[] visited;
    static ArrayList<ArrayList<Integer>> g;
    static int count = 0;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        g = new ArrayList<>();
        visited = new boolean[n+1];

        for(int i=0; i<=n; i++){
            g.add(new ArrayList<>());
        }
        
        StringTokenizer st;
        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            g.get(u).add(v);
            g.get(v).add(u);
        }

        visited[1] = true;
        dfs(1);
        
        System.out.println(count);
    }

    public static void dfs(int node){

        for(int i=0; i<g.get(node).size(); i++){
            int newnode = g.get(node).get(i);
            if(!visited[newnode]){
                visited[newnode] = true;
                count += 1;
                dfs(newnode);
            }
        }
        
    }
}
