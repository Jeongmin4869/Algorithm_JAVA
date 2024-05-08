import java.util.*;

public class Main_B2231 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int answer = 0;
        for(int i=1; i<N; i++){
            int sum = 0;
            int num = i;
            while(num>0){
                sum += num%10;
                num/=10;
            }
            if(sum+i == N){
                answer =i;
                break;
            }
        }
        System.out.println(answer);
        sc.close();
    }
}
