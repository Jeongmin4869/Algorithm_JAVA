import java.util.*;
import java.io.*;

class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++){
            int num = Integer.parseInt(br.readLine());
            int[] dp = new int[num+1];
            dp[1] = 1;
            if(num>=2) dp[2] = 1;
            if(num>=3) dp[3] = 1;
            for(int j=1; j<=num; j++){
                if(j+1 <= num) dp[j+1] += dp[j]; 
                if(j+2 <= num) dp[j+2] += dp[j]; 
                if(j+3 <= num) dp[j+3] += dp[j]; 
            }
            System.out.println(dp[num]);
            
        }
    }
}
