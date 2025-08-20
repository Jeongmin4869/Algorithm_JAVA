import java.util.*;
import java.io.*;

class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] dp = new int[100000+1];
        dp[2] = 1;
        dp[5] = 1;
        for(int i=2; i<=N; i++){
            if(dp[i-2] != 0) dp[i] = dp[i-2]+1;
            if(i-5 >= 0 && dp[i-5] != 0) dp[i] = dp[i-5]+1;
        }
        if(dp[N] == 0) System.out.print(-1);
        else System.out.print(dp[N]);
        
    }
}
