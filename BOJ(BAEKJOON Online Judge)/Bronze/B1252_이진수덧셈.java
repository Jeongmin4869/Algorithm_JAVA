import java.util.*;
import java.math.*; // BigInteger

class Main_B1252 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String a = sc.next();
        String b = sc.next();

        BigInteger aa = new BigInteger(a, 2);
        BigInteger bb = new BigInteger(b, 2);
        BigInteger sum = aa.add(bb);

        System.out.println(sum.toString(2));
        
    }
}
