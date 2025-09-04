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

        
        
        for(int i=0; i<N; i++){
            for(int j=0; j<=i; j++ ){
                if(arr[j] < arr[i]) dp[i] = Math.max(dp[i], dp[j]+1);
            }
        }

        
        System.out.println(dp[N-1]);
    }
}
