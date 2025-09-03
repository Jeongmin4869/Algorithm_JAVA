import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[][] dp = new int[1001][10];

        for(int i=0; i<=9; i++){
            dp[1][i] = i+1;
        }
        
        for(int i=2; i<=N; i++){
            for(int j=0; j<=9; j++){
                if(j>0)
                    // dp[i-1][j] : i-1 길이이면서 맨 마지막 숫자가 j   이하 까지의 오르막수 
                    // dp[i][j-1] : i   길이이면서 맨 마지막 숫자가 j-1 이하 까지의 오르막수 
                    // dp[i][j]   : i   길이이면서 맨 마지막 숫자가 j   이하 까지의 오르막수 
                    dp[i][j] = (dp[i-1][j] + dp[i][j-1])%10007;
                else
                    dp[i][j] = dp[i-1][j];                
            }
        }        
        System.out.println(dp[N][9]);
    }
}
