import java.util.*;
import java.lang.*;

class Main_B2075 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<n; j++){
                int num = Integer.parseInt(st.nextToken());
                if(pq.size()==n){
                    if(pq.peek()<num){
                        pq.poll();
                        pq.offer(num);
                    }
                }
                else{
                    pq.offer(num);
                }
            }
        }
        
        
        System.out.println(pq.poll());
    }
}
