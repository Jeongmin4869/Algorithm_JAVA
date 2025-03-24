import java.util.*;
import java.io.*;
import java.math.*;

class Main_B2407 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();

        BigInteger[][] dp = new BigInteger[101][101];

        // 파스칼의 삼각형
        for(int i=1; i<=n; i++){
            for(int j=0; j<=i; j++){
                if(i==j||j==0){
                    dp[i][j] = new BigInteger("1");
                }
                else{
                    dp[i][j] = dp[i-1][j-1].add(dp[i-1][j]);
                }
            }
        }
        
        System.out.println(dp[n][r]);
    }
}
