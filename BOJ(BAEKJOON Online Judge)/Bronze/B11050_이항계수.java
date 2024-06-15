import java.util.*;

public class Main_B11050 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        
        int num = factorial(N)/(factorial(K)*factorial(N-K));
        
        System.out.println(num);

        sc.close();
        
    }
    
    public static int factorial(int n){
        if(n == 0) return 1;
        return n * factorial(n-1);
    }
}
