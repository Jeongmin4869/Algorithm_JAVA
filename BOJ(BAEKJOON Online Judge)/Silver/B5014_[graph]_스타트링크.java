import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    static int F, S, G,U, D; 
    static boolean[] check = new boolean[1000001];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        F = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());
        G = Integer.parseInt(st.nextToken());
        U = Integer.parseInt(st.nextToken());
        D = Integer.parseInt(st.nextToken());
        
        int result = bfs();

        if(result != -1) System.out.print(result);
        else System.out.print("use the stairs");
    }

    public static int bfs(){
        check[S] = true;
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{S, 0});
        while(!q.isEmpty()){
            int[] top = q.poll();
            int now = top[0];
            int dep = top[1];
            if(now==G) return dep;
            if(now+U<=F && !check[now+U]){
                check[now+U] = true;
                q.offer(new int[]{now+U, dep+1});
            }
            if(now-D>=0 && !check[now-D]){
                check[now-D] = true;
                q.offer(new int[]{now-D, dep+1});
            }
        }
        return -1;
    }
}
