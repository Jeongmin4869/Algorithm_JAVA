// 1. sliding window

import java.util.*;
import java.lang.*;
import java.io.*;

class Main_B2559 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        
        int sum = 0;
        for(int i=0; i<M; i++){
            int num = Integer.parseInt(st.nextToken());
            arr[i] = num;
            sum += num;
        }
        int maxsum = sum;
        for(int i=M; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            sum = sum + arr[i] - arr[i-M];
            maxsum = Math.max(sum, maxsum);
            
        }

        
        System.out.println(maxsum);
    }
}
