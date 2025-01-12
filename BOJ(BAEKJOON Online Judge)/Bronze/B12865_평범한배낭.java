import java.util.*;
import java.io.*;

class Main_B12865 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 짐의 수 N, 들 수 있는 무게 K
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        // 무게, 가치
        int[][] arr = new int[N+1][2];
        for(int i=1; i<=N; i++){
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken()); // 무게
            arr[i][1] = Integer.parseInt(st.nextToken()); // 가치
        }

        // i번째까지 고려했을 때, 배낭의 최대 무게 k
        int[][] dp = new int[N+1][K+1];
        for(int i=1; i<=N; i++){
            for(int j=1; j<=K; j++){ // 무게
                if(arr[i][0] <= j){
                    dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-arr[i][0]]+arr[i][1]);
                }
                else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }

        System.out.print(dp[N][K]);
    }
}
