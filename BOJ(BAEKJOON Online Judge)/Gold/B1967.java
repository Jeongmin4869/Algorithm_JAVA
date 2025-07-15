import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    static ArrayList<ArrayList<Node>> list;
    static int[][] arr;
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

        arr = new int[N+1][N+1];
        
        for(int i=0; i<=N; i++){
            list.add(new ArrayList<>());
        }
        
        StringTokenizer st ;
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            list.get(u).add(new Node(v, m));
            list.get(v).add(new Node(u, m));
            
        }

        int result = dfs(1, 0);
        System.out.println(result);
    }

    public static void dfs(int node, int sum){
        for(int i=0; i<list.get(node).size(); i++){
            int newnode = list.get(node).get(i);
            dfs(newnode, sum + list.get(newnode).weight);
        }
    }
}
