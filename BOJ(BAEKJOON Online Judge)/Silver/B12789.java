import java.util.*;

public class Main_B12789 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        Stack<Integer> s = new Stack<>();
        int N = sc.nextInt();
        int count = 1;
        int num = 0;
        for(int i=0; i<N; i++){
            num = sc.nextInt();
            while(!s.empty() && s.peek() == count){
                s.pop();
                count += 1;
            }
            if(num == count) {
                count += 1;
                continue;
            }
            else {
                s.push(num);
            }
        }

        while(!s.empty() && s.peek() == count){
                s.pop();
                count += 1;
        }

        if(s.empty()) System.out.println("Nice");
        else System.out.println("Sad");
        
        sc.close();
    }

}
