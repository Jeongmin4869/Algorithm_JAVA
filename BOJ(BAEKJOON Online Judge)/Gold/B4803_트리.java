import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
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
            for(int i=1; i<n; i++){
                if(visited[i] == false){
                    if(bfs(visited, list, i, n)) count += 1;
                }
            }
        }
        
        System.out.println(0);
    }

    public static boolean bfs(boolean[] visited, ArrayList<ArrayList<Integer>> list, int root, int n){
        int[] parent = new int[n+1];
        visited[root] = true;
        Queue<Integer> m = new LinkedList<>();
        m.offer(root);
        while(!m.isEmpty()){
            int now = m.poll();
            for(int i=0; i<list.get(now).size(); i++){
                int node = list.get(now).get(i);
                if(visited[node] && parent[node] != now)
                    return false;
                visited[node] = true;
                parent[node] = now;
                m.offer(node);
            }
        }
        return true;
    }
}
