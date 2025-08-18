import java.util.*;
import java.io.*;

class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] dp = new String[N+1];
        dp[0] = "CY";
        for(int i=1; i<=N; i++){
            if(i-1>=0){
                if(dp[i-1].equals("CY"))
                    dp[i] = "SK";
                else 
                    dp[i] = "CY";
            }
            if(i-3>=0){
                if(dp[i-3].equals("CY"))
                    dp[i] = "SK";
                else 
                    dp[i] = "CY";
            }
        }

        System.out.println(dp[N]);
        
    }
}
