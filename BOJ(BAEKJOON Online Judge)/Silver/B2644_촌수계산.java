import java.util.*;
import java.io.*;

class Main {
    static ArrayList<ArrayList<Integer>> list;
    static int[] check;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(br.readLine());

        list = new ArrayList<>();
        check = new int[N+1];
        for(int i=0; i<N+1; i++){
            list.add(new ArrayList<Integer>());
        }

        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            list.get(x).add(y);
            list.get(y).add(x);
        }
        
        dfs(A, 0);

        if(check[B] == 0) System.out.print(-1);
        else System.out.print(check[B]);
    }

    public static void dfs(int node, int count){
        check[node] = count;
        for(int i=0; i<list.get(node).size(); i++){
            int newnode = list.get(node).get(i);
            if(check[newnode] == 0){                
                dfs(newnode, count+1);
            }
        }        
    }
}
