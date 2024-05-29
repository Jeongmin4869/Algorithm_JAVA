import java.util.*;

public class Main_B1735 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        int a2 = sc.nextInt();
        int b2 = sc.nextInt();
        
        int aa = (a1*b2)+(a2*b1);
        int bb = b2*b1;
        
        int g = gcd(Math.max(aa,bb),Math.min(aa,bb));
        
        System.out.print(aa/g + " "+bb/g);
        
        sc.close();
    }
    
    public static int gcd(int a, int b){
        if(a%b==0) return b;
        return gcd(b, a%b);
    }
    
}
