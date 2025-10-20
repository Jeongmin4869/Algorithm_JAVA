import java.util.*;
import java.io.*;

// 최단거리를 구하는 문제와 동일하므로 BFS를 사용하는 것을 권장
// DFS로 풀어보았음 

class Main {
    static int M, N;
    static ArrayList<ArrayList<Integer>> g;
    static boolean[] visited;
    static int count = 0;
    
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
        visited[1] = true;
        dfs(1, 0);
        
        System.out.println(count);
    }

    public static void dfs(int node, int dep){
        if(dep == 2)  return;
        
        for(int newnode : g.get(node)){
                
                if(!visited[newnode]) {
                    visited[newnode] = true;
                    count += 1;
                }
                dfs(newnode, dep + 1);
                
        }
    }
}
