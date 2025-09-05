import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        int[] dp = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            dp[i] = 1;
        }

        // LIS 최장증가부분수열을 저장할 변수
        int answer = 0;
        for(int i=0; i<N; i++){
            // i번째 상자까지의 LIS을 구하기 위한 반복문
            for(int j=0; j<i; j++ ){
                if(arr[j] < arr[i]) dp[i] = Math.max(dp[i], dp[j]+1);
            }
            // 현재까지 구한 LIS값을 항상 answer에 저장
            answer= Math.max(answer, dp[i]);
        }

        
        System.out.println(answer);
    }
}
