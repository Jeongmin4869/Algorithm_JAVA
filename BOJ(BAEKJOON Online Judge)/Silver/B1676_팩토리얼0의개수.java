import java.util.*;

class Main_B1676 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        while(N>0){
            count += N/5;
            N/=5;
        }
        System.out.println(count);
        sc.close();
    }
}
