import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++){
            int n = Integer.parseInt(br.readLine());
            long[][] dp = new long[65][10];
            for(int j=0; j<10; j++){
                dp[1][j] = j+1;
            }
            for(int j=2; j<=n; j++){
                dp[j][0] = 1;
                for(int k=1; k<10; k++){
                    dp[j][k] = dp[j][k-1] + dp[j-1][k];
                }
            }
            System.out.println(dp[n][9]);
        }
    }
}
