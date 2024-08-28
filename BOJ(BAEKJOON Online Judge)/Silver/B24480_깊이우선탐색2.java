import java.util.*;
import java.io.*;

class Main_B24480 {
    static ArrayList<ArrayList<Integer>> g;
    static int[] check;
    static int count;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        
        check = new int[n+1];
        g = new ArrayList<>();
        for(int i=0; i<=n ;i++){
            g.add(new ArrayList<>());
        }

        for(int i=0; i<m ;i++){ㅁ
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            g.get(u).add(v);
            g.get(v).add(u);
        }

        for(int i=1; i<=n ;i++){
            Collections.sort(g.get(i), Collections.reverseOrder());
        }

        count = 1;
        dfs(r);

        StringBuilder sb = new StringBuilder();
        for(int i=1; i<=n; i++){
            sb.append(check[i]).append("\n");
        }
        
        System.out.println(sb);
    }

    public static void dfs(int node){
        check[node] = count;
        for(int i=0; i<g.get(node).size(); i++){
            int newnode = g.get(node).get(i);
            if(check[newnode] == 0){
                count += 1;
                dfs(newnode);
            }
        }
    }

    
}
