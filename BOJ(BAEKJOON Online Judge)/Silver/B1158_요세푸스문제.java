import java.util.*;

class Main_B1158 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        Queue<Integer> q = new LinkedList<>();
        for(int i=1; i<=N; i++){
            q.offer(i);
        }

        StringBuilder sb = new StringBuilder();
        sb.append("<");
        while(q.size()>0){
            for(int i=1; i<K; i++){
                q.offer(q.poll());
            }
            if(q.size()>1)sb.append(q.poll()+ ", ");
            else sb.append(q.poll()+ ">");
        }
        
        System.out.println(sb);
    }
}
