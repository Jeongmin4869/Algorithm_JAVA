import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        long[] dp = new long[68];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        for(int i=4; i<=67; i++){
            dp[i] = dp[i-1] + dp[i-2] + dp[i-3] + dp[i-4];
        }
        
        for(int i=0; i<T; i++){
            int num = Integer.parseInt(br.readLine());
            System.out.println(dp[num]);
        }
    }
}
