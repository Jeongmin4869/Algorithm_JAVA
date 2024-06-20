import java.util.*;

public class Main_B24723 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum= 1;
        for(int i=1; i<=N; i++){ 
            sum *= 2;
        }
        System.out.println(sum);
        sc.close();
    }
}
