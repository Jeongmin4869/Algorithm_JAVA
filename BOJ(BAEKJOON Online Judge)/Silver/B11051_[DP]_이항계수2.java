import java.util.*;
import java.io.*;

class Main {
        
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        //  n! / (r!(n-r)!)
        // 이항계수를 나타내는 파스칼의 삼각형 을 활용 
        int[][] dp = new int[N+1][N+1];        
        dp[0][0] = 1;
        for(int i=1; i<=N; i++){
            dp[i][0] = 1;
            for(int j=1; j<=i; j++){               
                dp[i][j] = (dp[i-1][j-1] + dp[i-1][j]) % 10007;
            }
            
        }
        System.out.print(dp[N][K]);
    }

}
