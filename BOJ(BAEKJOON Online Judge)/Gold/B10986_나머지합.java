import java.util.*;
import java.io.*;

class Main_B10986 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] dp = new int[N+1];
        int[] cnt = new int[M];
        cnt[0] = 1 ; // 나머지가 0인 경우는 맨 처음부터 그 위치까지가 M으로 나눠떨어짐을 의미
        st = new StringTokenizer(br.readLine());
        for(int i=1; i<=N; i++){
            int num = Integer.parseInt(st.nextToken());
            dp[i] = (dp[i-1] + num)%M;
            cnt[dp[i]%M] += 1;
        }

        long count = 0;
        for(int i=0; i<M; i++){
           count += ((long)cnt[i]*(cnt[i]-1))/2; 
        }
        
        System.out.println(count);
        br.close();
    }
}
