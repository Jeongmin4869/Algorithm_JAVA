import java.util.*; // Deque, LinkedList

class Main_B1021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> dq = new LinkedList<>();
        int N = sc.nextInt();
        int M = sc.nextInt();
        int count = 0;
        
        for(int i=1; i<=N; i++){
            dq.offer(i);
        }

        for(int i=0; i<M; i++){
            int num = sc.nextInt();
            int index = dq.indexOf(num);
            while(dq.peekFirst() != num){
                count += 1;
                if(index <= dq.size()/2){
                    dq.offerLast(dq.pollFirst());
                }
                else {
                    dq.offerFirst(dq.pollLast());
                }    
            }
            dq.pollFirst();
        }
        System.out.println(count);
        sc.close();
    }    
}
