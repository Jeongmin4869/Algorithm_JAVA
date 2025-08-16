import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++){
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());

            int[][] dp = new int[15][15];

            for(int j=1; j<=14; j++){
                dp[j][1] = 1;
                dp[0][j] = j;
            }

            
            for(int a=1; a<=k; a++){
                for(int b=1; b<=n; b++){
                    dp[a][b] = dp[a-1][b] + dp[a][b-1];
                }
            }

            System.out.println(dp[k][n]);
        }
        
    }
}
