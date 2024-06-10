import java.util.*;

public class Main_B28278 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        StringBuilder sb = new StringBuilder();
        Stack<Integer> s = new Stack<>();
        int N = sc.nextInt();
        int num;
        for(int i=0; i<N; i++){
            num = sc.nextInt();
            if(num == 1){
                s.push(sc.nextInt());
            }
            else if(num == 2){
                if(!s.empty()) sb.append(s.pop()).append("\n");
                else sb.append(-1).append("\n");
            }
            else if(num == 3){
                sb.append(s.size()).append("\n");
            }
            else if(num == 4){
                sb.append(s.empty()?1:0).append("\n");
            }
            else if(num == 5){
                sb.append(s.empty()?-1:s.peek()).append("\n");
            }
        }
    
        System.out.println(sb);
        sc.close();
    }

}
