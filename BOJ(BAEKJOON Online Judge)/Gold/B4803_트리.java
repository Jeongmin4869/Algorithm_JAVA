import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int num = 1;
        while(true){
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            if(n==0) break;
            
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            for(int i=0; i<n+1; i++){
                list.add(new ArrayList<>());
            }
            for(int i=0; i<m; i++){
                st = new StringTokenizer(br.readLine());
                int u = Integer.parseInt(st.nextToken());
                int v = Integer.parseInt(st.nextToken());
                list.get(u).add(v);
                list.get(v).add(u);
            }
            
            boolean[] visited = new boolean[n+1];            
            int count = 0;
            for(int i=1; i<=n; i++){
                if(visited[i] == false){
                    //if(bfs(visited, list, i, n)) count += 1;
                    int[] parent = new int[n+1];
                    if(dfs(visited, parent, list, i)) count += 1;
                    
                }
            }

            if(count == 0) System.out.println("Case " + num + ": No trees.");
            else if(count == 1) System.out.println("Case " + num + ": There is one tree.");
            else if(count > 1) System.out.println("Case " + num + ": A forest of " + count + " trees.");

            num += 1;
            
        }
    }

    public static boolean dfs(boolean[] visited, int[] parent, ArrayList<ArrayList<Integer>> list, int root){
        visited[root] = true;
        for(int i=0; i<list.get(root).size(); i++){
            int node = list.get(root).get(i);
            if(!visited[node]){                
                parent[node] = root;
                if(!dfs(visited, parent, list, node)) return false;
            }
            else if(parent[root] != node) {
                return false;
            }
        }
        return true;
    }

    public static boolean bfs(boolean[] visited, ArrayList<ArrayList<Integer>> list, int root){
        int[] parent = new int[list.size()+1];
        visited[root] = true;
        Queue<Integer> m = new LinkedList<>();
        m.offer(root);
        while(!m.isEmpty()){
            int now = m.poll();
            for(int i=0; i<list.get(now).size(); i++){
                int node = list.get(now).get(i);
                if(!visited[node]){
                    visited[node] = true;
                    parent[node] = now;
                    m.offer(node);
                }
                else if(parent[now] != node){
                    return false;
                }
            }
        }
        return true;
    }
}
