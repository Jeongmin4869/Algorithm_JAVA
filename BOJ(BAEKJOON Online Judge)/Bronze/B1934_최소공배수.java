import java.util.*;

public class Main_B1934 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        int N = sc.nextInt();
        int a, b;
        for(int i=0; i<N; i++){
            a = sc.nextInt();
            b = sc.nextInt();
            System.out.println(a*b/gcd(a, b));
        }
        sc.close();
    }
    
    public static int gcd(int a, int b){
        if(a%b==0) return b;
        return gcd(b, a%b);
    }
    
}
