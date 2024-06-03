import java.util.*;

public class Main_B13909 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        int N = sc.nextInt();
        
        int count = 0 ;
        // 제곱수 구하기. 제곱수는 약수가 홀수개. 
        for(int i=1; i*i<=N; i++){
            count += 1;
        }
        
        System.out.println(count);
        
        sc.close();
    }  
 
}
