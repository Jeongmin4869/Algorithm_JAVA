import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] dp = new int[N+1];
        int[] pre = new int[N+1];
        for(int i=2; i<=N; i++){
            dp[i] = dp[i-1] + 1;
            pre[i] = i-1;
            if(i%2==0 && dp[i/2] < dp[i]){
                dp[i] = dp[i/2] + 1;
                pre[i] = i/2;
            }
            if(i%3==0 && dp[i/3] < dp[i]){
                dp[i] = dp[i/3] + 1;
                pre[i] = i/3;
            }
        }
        System.out.println(dp[N]);

        for(int i=N; i>=1; ){
            System.out.print(i + " ");
            i = pre[i];
        }
    }
