import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    static int N, count;
    static ArrayList<ArrayList<Integer>> g;
    static boolean[] check;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        count = 0;
        check = new boolean[N+1];
        g = new ArrayList<>();
        
        for(int i=0; i<=N; i++){
            g.add(new ArrayList<>());
        }

        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt( br.readLine());
        for(int i=1; i<=N; i++){
            int num = Integer.parseInt(st.nextToken());
            if(num!=-1 && num!=M){
                g.get(num).add(i);
            }
        }

        for(int i=1; i<=N; i++){
            if(!check[i]){
                dfs(i,1);
            }
        }
        
        System.out.println(count);
    }

    public static void dfs(int node, int dep){
        check[node] = true;
        if(g.get(node).size() == 0 && dep>1){
            count += 1;
            return;
        }

        for(int newnode : g.get(node)){
            if(!check[newnode]) dfs(newnode, dep+1);
        }
    }
}
