import java.util.*;
import java.lang.*;
import java.io.*;

class Main {

    static ArrayList<ArrayList<Integer>> g;
    static boolean[] visited;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int a=0; a<T; a++){
            int N = Integer.parseInt(br.readLine());            
            g = new ArrayList<>();
            
            for(int i=0; i<=N; i++){
                g.add(new ArrayList<>());    
            }

            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i=1; i<=N; i++){                
                int v = Integer.parseInt(st.nextToken());
                g.get(i).add(v);
            }

            visited = new boolean[N+1];
            int count = 0;
            for(int i=1; i<=N; i++){                
                if(!visited[i]){
                    visited[i] = true;
                    count += 1;
                    //bfs(i);
                    dfs(i);
                }
            }
            System.out.println(count);            
        }
    }

    public static void dfs(int node){
        for(int newnode : g.get(node)){
            if(!visited[newnode]){
                visited[newnode] = true;
                dfs(newnode);
            }
        }
    }

    public static void bfs(int node){
        Queue<Integer> q = new LinkedList<>();        
        q.offer(node);
        while(!q.isEmpty()){
            int nownode = q.poll();
            for(int i=0; i<g.get(nownode).size(); i++){
                int newnode = g.get(nownode).get(i);
                if(!visited[newnode]){
                    visited[newnode] = true;
                    q.offer(newnode);
                }
            }
        }
    }

}
