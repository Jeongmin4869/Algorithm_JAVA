import java.util.*;
public class Main_B2501 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num =  sc.nextInt();
        int N = sc.nextInt();
        int count = 0;
        int i;
        for (i = 1; i <= num; i++) {
            if(num%i==0)
                count++;
            if(count == N)
                break;
        }
        System.out.println(N==count?i:0);
        sc.close();
    }
}
