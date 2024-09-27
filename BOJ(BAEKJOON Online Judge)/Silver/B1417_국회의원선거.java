import java.util.*;
import java.io.*;

class Main_B1417 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int D = Integer.parseInt(br.readLine());
        int count = 0;
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=1; i<N; i++){
            q.offer(Integer.parseInt(br.readLine()));
        }

        while(!q.isEmpty()){
            int now = q.peek();
            if(now >= D){
                D += 1;
                count += 1;
                q.offer(q.poll()-1);
            }
            else{
                q.poll();
            }
        }
        
        System.out.println(count);
    }
}
