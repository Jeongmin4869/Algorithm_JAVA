import java.util.*;
import java.io.*;

class Main_B11054 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] dp1 = new int[N];
        Arrays.fill(dp1, 1);
        for(int j=1; j<N; j++){
            for(int i=0; i<j; i++){
                if(arr[i]<arr[j]){
                    dp1[j] = Math.max(dp1[i]+1, dp1[j]);
                }
            }
        }

        int[] dp2 = new int[N];
        Arrays.fill(dp2, 1);
        for(int j=N-2; j>=0; j--){
            for(int i=N-1; i>j; i--){
                if(arr[i]<arr[j]){
                    dp2[j] = Math.max(dp2[i]+1, dp2[j]);
                }
            }
        }

        int max = 0;
        for(int i=0; i<N; i++){
            max = Math.max(dp1[i]+dp2[i]-1, max);
        }
        
        System.out.println(max);
        br.close();
    }
}
