import java.util.*;
import java.io.*;

class Main_B2644 {
    static ArrayList<ArrayList<Integer>> list;
    static int[] check;
    //static int count = 0;
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
        
        //count = 0;
        //dfs(A, 0);
        bfs(A);

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
    public static void bfs(int node){
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{node, 0});
        while(!q.isEmpty()){
            int[] now = q.poll();
            int num = now[0];
            int count = now[1];
            for(int i=0; i<list.get(num).size(); i++){
                int newnode = list.get(num).get(i);
                if(check[newnode] == 0){
                    check[newnode] = count + 1;
                    q.offer(new int[]{newnode, count+1});
                }
            }            
        }
    }
}
