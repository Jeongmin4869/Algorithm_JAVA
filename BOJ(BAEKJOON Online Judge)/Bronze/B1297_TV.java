import java.util.*;

class Main_B1297 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        double x = a / Math.sqrt((b*b + c*c));
        int h = (int)(b*x);
        int w = (int)(c*x);
        System.out.println(h+" "+w);
    }
}
