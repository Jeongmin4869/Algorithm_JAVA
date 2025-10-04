import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    static int M, N, Z, X;
    static ArrayList<ArrayList<Integer>> g;
    static int[] arr;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        Z = Integer.parseInt(st.nextToken());
        X = Integer.parseInt(st.nextToken());

        g = new ArrayList<>();
        for(int i=0; i<=N; i++){
            g.add(new ArrayList<>());
        }

        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            g.get(u).add(v);
        }

        arr = new int[N+1];
        //dfs(X, 0);
        // 최단거리 탐색은 bfs
        bfs(X);
        boolean zero = true;
        for(int i=1; i<=N; i++){
            if(i!=X && arr[i] == Z){
                System.out.println(i);
                zero = false;
            }
        }
        if(zero)
            System.out.println(-1);
    }

    public static void dfs(int node, int count){

        if(arr[node]>0) return;
        
        for(int i=0; i<g.get(node).size(); i++){
            int newnode = g.get(node).get(i);
            arr[newnode] = count + 1;
            dfs(newnode, count+1);
        }
    }

    public static void bfs(int node){
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{node, 0});
        
        while(!q.isEmpty()){
            int[] now = q.poll();
            int n = now[0];
            int count = now[1];
            for(int i=0; i<g.get(n).size(); i++){
                int newnode = g.get(n).get(i);
                if(arr[newnode]==0){
                    arr[newnode] = count + 1;
                    q.offer(new int[]{newnode, count+1});
                }
            }
        }
    }
    
}
