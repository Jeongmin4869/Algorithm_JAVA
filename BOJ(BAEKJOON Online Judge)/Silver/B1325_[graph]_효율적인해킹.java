import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {

    static int N, M;
    static ArrayList<ArrayList<Integer>> g;
    static int[] arr;
    static boolean[] visited;
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N+1];
        g = new ArrayList<>();
        for(int i=0; i<=N; i++){
            g.add(new ArrayList<>());
        }

        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            g.get(a).add(b);
        }

        int maxval = 0;
        for(int i=1; i<=N; i++){
            visited = new boolean[N+1];
            dfs(i);
        }

        for(int i=1; i<=N; i++){
            maxval = Math.max(maxval, arr[i]);
        }

        for(int i=1; i<=N; i++){
            if(arr[i] == maxval)
                System.out.print(i + " ");
        }

    }

    public static void dfs(int node){
        visited[node] = true;
        for(int newnode : g.get(node)){
            if(!visited[newnode]){
                arr[newnode] += 1;
                dfs(newnode);
            }
        }
    }
}
