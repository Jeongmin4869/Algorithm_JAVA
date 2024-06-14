import java.util.*;

public class Main_B11866 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        StringBuilder sb = new StringBuilder();
        Queue<Integer> q = new LinkedList<>();
        int N = sc.nextInt();
        int K = sc.nextInt();
        
        for(int i=1; i<=N; i++){
            q.add(i);
        }
        
        int count = 0;
        sb.append("<");
        while(!q.isEmpty()){
            count += 1;
            if(count == K){
                sb.append(q.poll());
                if(!q.isEmpty()){
                    sb.append(", ");
                }
                count = 0;
                continue;
            }
            q.add(q.poll());
        }
        sb.append(">");
        System.out.println(sb);
        sc.close();
    }

}
