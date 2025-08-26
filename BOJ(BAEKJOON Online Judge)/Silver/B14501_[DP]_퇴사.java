import java.util.*;
import java.io.*;

class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[][] arr = new int[T][2];
        StringTokenizer st;
        for(int i=0; i<T; i++){
            st = new StringTokenizer(br.readLine());
            int d = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            arr[i][0] = d;
            arr[i][1] = m;
            
        }

        int[] dp = new int[T+1];

        // 전날기준 i일에 도착했을때의 최대 수익
        // 그래서 i도 0부터 시작
        for(int i=0; i<T; i++){
            if(i + arr[i][0] <= T) {
                dp[i + arr[i][0]] = Math.max(dp[i + arr[i][0]] , dp[i] + arr[i][1]);
            }
            dp[i+1] = Math.max(dp[i], dp[i+1]);
        }        
        System.out.print(dp[T]);        
    }
}
