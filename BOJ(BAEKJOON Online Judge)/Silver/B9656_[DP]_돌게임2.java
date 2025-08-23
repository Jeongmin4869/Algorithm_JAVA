import java.util.*;
import java.io.*;

class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] dp = new int[N+1];
        for(int i=1; i<=N; i++){
            if(i-1 >= 0){
                dp[i] = (dp[i-1]+1)%2;
            }
            if(i-3 >= 0){
                dp[i] = (dp[i-3]+1)%2;
            }
        }
        if(dp[N] == 0) System.out.print("SK");
        if(dp[N] == 1) System.out.print("CY");
        
    }
}
