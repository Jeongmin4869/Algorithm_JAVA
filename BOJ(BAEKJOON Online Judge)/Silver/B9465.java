import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int a=0; a<T; a++){
            int N = Integer.parseInt(br.readLine());
            int[][] arr = new int[N+1][2];
            StringTokenizer s1 = new StringTokenizer(br.readLine());
            StringTokenizer s2 = new StringTokenizer(br.readLine());

            int answer = 0;
            for(int i=1; i<=N; i++){
                arr[i][0] = Integer.parseInt(s1.nextToken());
                arr[i][1] = Integer.parseInt(s2.nextToken());
            }

            int[] dp = new int[N+1];
            for(int i=1; i<=N; i++){
                dp[i] = Math.max(dp[i-1], Math.max(arr[i][0] , Math.max(arr[i][1], arr[i][0]+arr[i-1][1])));
            }

            System.out.println(dp[N]);
        }
    }
}
