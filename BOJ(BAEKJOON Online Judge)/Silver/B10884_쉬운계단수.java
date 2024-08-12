import java.util.*;

class Main_B10884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long M = 1000000000;
        long[][] dp = new long[N][10];
        long count = 0;

        for(int i=1; i<=9; i++ ){
            dp[0][i] = 1;
        }
        
        for(int i=1; i<N; i++ ){
            for(int j=0; j<=9; j++){
                if(j==0) dp[i][j] = dp[i-1][j+1]%M;
                else if(j==9) dp[i][j] = dp[i-1][j-1]%M;
                else dp[i][j] = (dp[i-1][j+1] + dp[i-1][j-1])%M;
            }
        }

        for(int i=0; i<=9; i++ ){
            count = (count + dp[N-1][i])%M;
        }
        
        
        System.out.println(count);
    }
}
