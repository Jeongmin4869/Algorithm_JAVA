import java.util.*;
import java.io.*;

class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] dp = new int[N+1][2];
        dp[0][0] = 1;

        // B -> BA
        // A ->  B
        for(int i=1; i<=N; i++){
            dp[i][0] = dp[i-1][1];
            dp[i][1] = dp[i-1][1] + dp[i-1][0];
        }

        System.out.println(dp[N][0] + " " + dp[N][1]);        
        
    }
}
