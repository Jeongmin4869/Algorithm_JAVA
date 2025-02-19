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
            int[] arr1 = new int[n];
            int[] arr2 = new int[m];
            double sum1 =0, sum2 =0;

            st = new StringTokenizer(br.readLine());
            for(int i=0; i<n; i++){
                int num = Integer.parseInt(st.nextToken());
                sum1 += num;
                arr1[i] = num;
            }

            st = new StringTokenizer(br.readLine());
            for(int i=0; i<m; i++){
                int num = Integer.parseInt(st.nextToken());
                sum2 += num;
                arr2[i] = num;
            }

            double ave1 = (double)sum1/n;
            double ave2 = (double)sum2/m;
            
            int result = 0;
            for(int i=0; i<Math.min(n,m); i++){
                int cscore = arr1[i];
                int sscore = arr2[i];

                // Compare the new averages with original averages
                if ((double)cscore <= ave1 && (double)sscore >= ave2) {
                    result += 1;
                }
            }

            System.out.println(result);
        }
        
    }
}
