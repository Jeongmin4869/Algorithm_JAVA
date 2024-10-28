import java.util.*;

class Main_B1835 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Deque<Integer> dq = new LinkedList<>();
        dq.offerFirst(N);
        for(int i=N-1; i>=1; i--){
            dq.offerFirst(i);
            int num = i%dq.size();
            for(int j=0; j<num; j++){
                dq.offerFirst(dq.pollLast());
            }
        }

        StringBuilder sb = new StringBuilder();
        while(!dq.isEmpty()){
            sb.append(dq.pollFirst()).append(" ");
        }
        
        System.out.println(sb);
        sc.close();
    }
}
