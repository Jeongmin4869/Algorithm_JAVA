import java.util.*;

class Main_B1057 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count = 0;
        while(a!=b){            
            a = (a+1) / 2;
            b = (b+1) / 2;
            count += 1;
        }
        System.out.println(count);
        sc.close();
    }

}
