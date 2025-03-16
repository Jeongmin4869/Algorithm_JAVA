import java.util.*;
import java.io.*;

class Main_B2302 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int[] vip = new int[M+1];

        vip[0] = 0;
        for(int i=1; i<=M; i++){            
            vip[i] = Integer.parseInt(br.readLine());
        }

        long[] dp = new long[51];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        int s = 1;
        for(int i=3; i<=N; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        
        long result = 1;
        for(int i=1; i<=M; i++){
            result *= dp[vip[i] - vip[i-1] - 1 ];
        }
        
        System.out.println(result * dp[N-vip[M]]);
    }
}
