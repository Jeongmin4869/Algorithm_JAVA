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
                    count += 1;
                    bfs(i);
                }
            }
            System.out.println(count);            
        }
    }

    public static void bfs(int node){
        Queue<Integer> q = new LinkedList<>();
        visited[node] = true;
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
