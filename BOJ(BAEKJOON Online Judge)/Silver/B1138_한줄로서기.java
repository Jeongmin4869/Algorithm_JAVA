import java.util.*;
import java.io.*;

class Main_B1138 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        int[] dp = new int[N];

        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=0; i<N; i++){
            int index = 0;
            int count = arr[i];
            while(true){
                if(count==0 && dp[index]==0){
                    dp[index] = i+1;
                    break;
                }
                if(dp[index]==0){
                    count -= 1;
                }
                index += 1;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<N; i++){
            sb.append(dp[i] + " ");
        }
        System.out.println(sb);
        br.close();
    }
}
