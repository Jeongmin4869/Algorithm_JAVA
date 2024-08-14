import java.util.*;

class Main_B1094 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        pq.offer(64);
        int sum = pq.peek();

        while(true){
            if(sum==target) break;
            
            int n = pq.poll();
            if((sum - n/2) >= target){
                sum -= n/2;
                pq.offer(n/2);
            }
            else{
                pq.offer(n/2);
                pq.offer(n/2);
            }
        }
        System.out.print(pq.size());
    }
}
