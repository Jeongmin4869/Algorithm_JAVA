import java.util.*;
import java.io.*;

class Main_B1699 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] dp = new int[N+1];

        for(int i=1; i<=N; i++){
            dp[i] = i;
            for(int j=1; j*j<=i; j++){
                dp[i]   = Math.min(dp[i], dp[i-j*j]+1);
            }
        }
        System.out.print(dp[N]);
    }
}
