import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    static int[] check;
    static ArrayList<ArrayList<Integer>> g;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        check = new int[N+1];
        g = new ArrayList<>();
        for(int i=0; i<=N; i++){
            g.add(new ArrayList<>());
        }

        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            g.get(u).add(v);
            g.get(v).add(u);
        }

        Arrays.fill(check, -1);
        bfs();

        int result = 0;
        int dis = 0;
        int count = 0;
        for(int i=1; i<=N; i++){
            if(dis<check[i]){
                result = i;
                dis=check[i];
                count = 0;
            }
            if(check[i] == dis) count += 1;
        }
        System.out.print(result + " " + dis + " " + count);
    }

    public static void bfs(){
        check[1] = 0;
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{1, 0});
        
        while(!q.isEmpty()){
            int[] now = q.poll();
            int nownode = now[0];
            int dis = now[1];
            for(int newnode : g.get(nownode)){
                if(check[newnode] == -1){
                    check[newnode] = dis+1;
                    q.offer(new int[]{newnode, dis+1});
                }
            }
        }
    }
}
