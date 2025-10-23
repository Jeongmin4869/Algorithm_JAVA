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
            q.offer(new int[]{now+1, dep+1});
            q.offer(new int[]{now*2, dep+1});
            q.offer(new int[]{now*3, dep+1});
        }
        
        System.out.println(count);
    }
}
