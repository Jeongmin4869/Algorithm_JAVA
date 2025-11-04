import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());
        int[] dp = new int[D+1];

        for(int i=1; i<=D; i++){
            dp[i] = i;
        }
        
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            int l = Integer.parseInt(st.nextToken());
            if(e>D) continue;
            if(e-s<l) continue;
            dp[e] = Math.min(dp[e], dp[s]+l);
        }

        int min = dp[D];
        for(int i=1; i<=D; i++){
            min = Math.min(dp[i] + D-i, min);
        }
        
        System.out.println(min);
    }
}
