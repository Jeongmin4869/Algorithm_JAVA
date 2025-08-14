import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] dp = new int[10001];

        dp[1] = 1;
        dp[2] = 2;
        for(int i=3; i<=N; i++){
            dp[i] = (dp[i-1] + dp[i-2])%10007;//ㅅㅔㄹㅗ 1 ㄱㅏㄹㅗ2
        }
        
        System.out.println(dp[N]);
    }
}
