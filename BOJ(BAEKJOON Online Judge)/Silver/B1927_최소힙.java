import java.util.*;
import java.io.*;a

class Main_B1927 {
    static StringBuilder sb;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0; i<N; i++){
            int num = Integer.parseInt(br.readLine());
            if(num==0) func(pq);
            else pq.add(num);
        }
        
        System.out.println(sb);
        br.close();
    }

    public static void func(PriorityQueue<Integer> pq){
        if(pq.isEmpty()) sb.append(0);
        else sb.append(pq.poll());
        sb.append("\n");
    }
}
