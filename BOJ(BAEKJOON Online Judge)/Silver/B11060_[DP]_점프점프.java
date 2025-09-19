import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] dp = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            dp[i] = N+1;
        }

        dp[0] = 0;
        for(int i=0; i<N; i++){
            for(int j=1;j<=arr[i]&&i+j<N; j++ ){
                dp[i+j] = Math.min(dp[i]+1, dp[i+j]);
            }
            
        }

        int answer = dp[N-1];
        if(answer == N+1) answer = -1;
        System.out.println(answer);
    }
}
