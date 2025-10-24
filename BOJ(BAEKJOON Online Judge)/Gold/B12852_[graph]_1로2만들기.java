import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int count = 0;
        StringBuilder sb = new StringBuilder();

        int[] prev = new int[N+1];
        Arrays.fill(prev, -1);
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{1, 0});
        while(!q.isEmpty()){
            int[] top = q.poll();
            int now = top[0];
            int dep = top[1];
            
            if(now == N) {
                count = dep;
                break;
            }
            if(now+1<=N && prev[now+1] == -1){
                    q.offer(new int[]{now+1, dep+1});
                    prev[now+1] = now;
                
            }
            if(now*2<=N && prev[now*2] == -1){
                q.offer(new int[]{now*2, dep+1});
                prev[now*2] = now;
            }
            if(now*3<=N&& prev[now*3] == -1){
                q.offer(new int[]{now*3, dep+1});
                prev[now*3] = now;
            }
        }

        System.out.println(count);

        for(int i=N; i>0; ){
            System.out.print(i + " ");
            i = prev[i];
        }
    }
}
