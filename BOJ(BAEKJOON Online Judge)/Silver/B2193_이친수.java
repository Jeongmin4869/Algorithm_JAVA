import java.util.*;

class Main_B2193 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long dp[] = new long[N+1];
        
        if(N==0){
            System.out.println(0);
            return;
        }
        if(N==1){
            System.out.println(1);
            return;
        }
        
        dp[1] = 1;
        dp[2] = 1;
        for(int i=3; i<=N; i++){
            dp[i] = dp[i-1]+dp[i-2];
        }
        
        System.out.println(dp[N]);
    }
}
