import java.util.*;

public class Main_B10773 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        StringBuilder sb = new StringBuilder();
        Stack<Integer> s = new Stack<>();
        int N = sc.nextInt();
        int num;
        for(int i=0; i<N; i++){
            num = sc.nextInt();
            if(num == 0&& !s.empty())s.pop();
            else s.push(num);
        }
        
        int sum = 0;
        while(!s.empty()) {
            sum += s.pop();
        }
    
        System.out.println(sum);
        sc.close();
    }

}
