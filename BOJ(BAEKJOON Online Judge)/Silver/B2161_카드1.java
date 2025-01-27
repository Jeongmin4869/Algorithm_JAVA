import java.util.*;

class Main_B2161 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Queue<Integer> q = new LinkedList<>();
        for(int i=1; i<=N; i++){
            q.add(i);
        }

        StringBuilder sb = new StringBuilder();
        while(!q.isEmpty()){
            sb.append(q.poll() + " ");
            if(q.isEmpty()) break;
            q.add(q.poll());
        }
        
        System.out.println(sb);
    }
}
