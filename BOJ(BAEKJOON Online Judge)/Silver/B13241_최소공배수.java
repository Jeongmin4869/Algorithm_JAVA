import java.util.*;
// The main method must be in a class named "Main".
class Main_B13241 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();

        System.out.println(lcm(Math.max(a,b), Math.min(a, b)));

        sc.close();
    }

    public static long gcb(long a, long b){
        if(a%b==0) return b;
        return gcb(b, a%b);       
    }

    public static long lcm(long a, long b){
        return a*b/gcb(a,b);
    }
}
