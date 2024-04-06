import java.util.Scanner;

public class Main_B2908 {
    
    public static int sangsoo(int num) {
        StringBuffer sb = new StringBuffer(String.valueOf(num));
        return Integer.valueOf(sb.reverse().toString());
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int max = Math.max(sangsoo(num1), sangsoo(num2));
        System.out.println(max);
    }
}
