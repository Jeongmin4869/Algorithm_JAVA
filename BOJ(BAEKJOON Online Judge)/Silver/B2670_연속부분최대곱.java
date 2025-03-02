import java.util.*;
import java.io.*;

class Main_B2670 {
        
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        
        int N = Integer.parseInt(br.readLine());
        double[] arr = new double[N];
        for(int i=0; i<N; i++){
            arr[i] = Double.parseDouble(br.readLine());
        }

        double[] dp = new double[N];
        dp[0] = arr[0];
        double max = 0;
        for(int i=1; i<N; i++){
            dp[i] = Math.max(arr[i], arr[i] * dp[i-1]);
            if(max < dp[i]) max = dp[i];
        }

        System.out.print(String.format("%.3f", max));
    }
}
