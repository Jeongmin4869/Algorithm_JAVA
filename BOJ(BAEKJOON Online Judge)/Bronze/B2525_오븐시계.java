import java.util.Scanner;

public class Main_B2525 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int need_m = sc.nextInt();

        System.out.println((h+(m+need_m)/60)%24 + " " + (m+need_m)%60);

    }
}
