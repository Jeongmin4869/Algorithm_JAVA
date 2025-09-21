import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] happy = new int[N+1];
        int[] health = new int[N+1];
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for(int i=1; i<=N; i++){
            health[i] = Integer.parseInt(st1.nextToken());
            happy[i] = Integer.parseInt(st2.nextToken());
        }

        int[]dp = new int[101];
        int result = 0;
        for(int i=1; i<=N; i++){
            for(int j=100; j>=0; j--){
                if(j-health[i]>0){
                    dp[j] = Math.max(dp[j], dp[j-health[i]]+happy[i]);
                    result = Math.max(dp[j], result);
                }
            }
                
        }
        System.out.println(result);
    }
}
