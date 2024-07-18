import java.util.*;
import java.io.*;

class Main_B2156 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        int[] dp = new int[N];

        if(N==1) {System.out.println(arr[0]); return;}
        if(N==2) {System.out.println(arr[0] + arr[1]); return;}
        
        dp[0] = arr[0];
        dp[1] = arr[0] + arr[1];
        dp[2] = Math.max(arr[0] + arr[1], Math.max(arr[0] + arr[2], arr[1] + arr[2]));

        int maxval=dp[2];
        for(int i=3; i<N; i++){
            dp[i] = Math.max(dp[i-3]+arr[i-1]+arr[i],dp[i-2]+arr[i]);
            dp[i] = Math.max(dp[i-1],dp[i]);
            maxval=Math.max(maxval,dp[i]);
        }
        
        System.out.println(maxval);
        br.close();
    }
}
