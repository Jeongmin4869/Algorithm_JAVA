import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++){
            int N = Integer.parseInt(br.readLine());
            int[] arr = new int[N+1];
            int[] dp = new int[N+1];
            int maxsum = -1000;
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=1; j<=N; j++){
                arr[j] = Integer.parseInt(st.nextToken());
                dp[j] = Math.max(dp[j-1]+arr[j], arr[j]);
                maxsum = Math.max(dp[j], maxsum);
            }
            System.out.println(maxsum);
        }
        
    }
}
