import java.util.*;
import java.io.*;

class Main_B11053 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] dp = new int[N];
        int[] val = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            val[i]=Integer.parseInt(st.nextToken());
            dp[ㅑ]=1;
        }

        for(int i=1; i<N; i++){
           for(int j=0; j<i; j++){
               if(val[j]<val[i]&&dp[j]>=dp[i])
                   dp[i] = dp[j]+1;
           }
        }

        int maxval= 0;
        for(int i=0; i<N; i++){
            maxval=Math.max(maxval, dp[i]);
        }
        
        System.out.print(maxval);
        br.close();
    }
}
