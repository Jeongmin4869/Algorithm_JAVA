import java.util.*;
import java.io.*;

class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long[] dp = new long[80+1];
        dp[1] = 1;
        dp[2] = 1;
        
        for(int i=3; i<=N+1; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }

        System.out.print(dp[N+1]*2 + dp[N]*2);
        
    }
}
