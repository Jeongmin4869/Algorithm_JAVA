import java.util.*;
import java.io.*;

class Main_B11279 {
    static StringBuilder sb = null;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        PriorityQueue<Integer> pq = new PriorityQueue(Collections.reverseOrder());
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            int num=Integer.parseInt(br.readLine());
            if(num == 0) func(pq);
            else pq.add(num);
        }
        System.out.print(sb);
        br.close();
    }

    public static void func(PriorityQueue<Integer> pq){
        if(pq.isEmpty()) sb.append(0);
        else sb.append(pq.poll());
        sb.append("\n");
    }
}
