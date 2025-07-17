import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    static ArrayList<ArrayList<Node>> list;
    static boolean visited[];
    static int farthestIdx = 0;
    static int max = 0;

    static class Node{
        int n;
        int weight;
        Node(int n, int weight){
            this.n = n;
            this.weight = weight;
        }
    }
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        list = new ArrayList<>();
        
        for(int i=0; i<=N; i++){
            list.add(new ArrayList<>());
        }
        
        StringTokenizer st ;
        for(int i=0; i<N-1; i++){
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            list.get(u).add(new Node(v, m));
            list.get(v).add(new Node(u, m));
            
        }
/*
        for(int i=1; i<=N; i++){
            visited = new boolean[N+1];
            visited[i] = true;
            dfs(i, 0);
        }
*/

        visited = new boolean[N+1];
        visited[1] = true;
        dfs(1, 0);

        visited = new boolean[N+1];
        visited[farthestIdx] = true;
        max = 0;
        dfs(farthestIdx, 0);
        System.out.println(max);
    }

    public static void dfs(int node, int sum){
        for(int i=0; i<list.get(node).size(); i++){
            Node newnode = list.get(node).get(i);
            if(!visited[newnode.n]){
                visited[newnode.n] = true;
                dfs(newnode.n, sum + newnode.weight);
                visited[newnode.n] = false;
            }
        }
        if(sum>max){
            max = sum;
            farthestIdx = node;
        }
        
    }
}
