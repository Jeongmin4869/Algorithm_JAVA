import java.util.*;
import java.io.*;

class Main_B2546 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int tcount = 0;
        while(tcount<T){
            tcount += 1;
            br.readLine();
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            long[] score = new long[n];
            long sum1 =0, sum2 =0;

            st = new StringTokenizer(br.readLine());
            for(int i=0; i<n; i++){
                int num = Integer.parseInt(st.nextToken());
                sum1 += num;
                score[i] = num;
            }

            st = new StringTokenizer(br.readLine());
            for(int i=0; i<m; i++){
                int num = Integer.parseInt(st.nextToken());
                sum2 += num;
            }

            int result = 0;
            for(int i=0; i<n; i++){
                if (score[i]*n < sum1 && score[i]*m > sum2) {
                    result += 1;
                }
            }
            System.out.println(result);
        }
        
    }
}
