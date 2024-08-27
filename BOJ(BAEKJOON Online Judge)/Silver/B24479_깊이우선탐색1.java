import java.util.*;
import java.io.*;

class Main_B24479 {
    static int count = 0;
    static int[] check;
    static ArrayList<ArrayList<Integer>> list;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        
        check = new int[n+1];

        list = new ArrayList<>();
        for(int i=0;i<=n; i++){
            list.add(new ArrayList<Integer>());
        }

        for(int i=0;i<m; i++){
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            list.get(u).add(v);
            list.get(v).add(u);
        }

        for(int i=1;i<=n; i++){
            Collections.sort(list.get(i));
        }
        
        count = 1;
        dfs(r);

        StringBuilder sb = new StringBuilder();
        for(int i=1;i<=n; i++){
            sb.append(check[i]).append("\n");
        }
        System.out.println(sb);
        br.close();
    }

    public static void dfs(int node){
        check[node] = count;
        for(int i=0; i<list.get(node).size(); i++){
            int newnode = list.get(node).get(i);
            if(check[newnode] == 0){
                count += 1;
                dfs(newnode);
            }
        }
    }
}
