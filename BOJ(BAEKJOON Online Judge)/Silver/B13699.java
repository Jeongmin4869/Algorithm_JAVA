import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long[] dp = new long[36];
        dp[0] = 1;
        for(int i=1; i<=N; i++){
            for(int j=i-1; j>=0; j--){
                dp[i] += dp[j] * dp[i-1-j];
            }
        }
        
        System.out.println(dp[N]); 
    }
}
