import java.util.*;
import java.io.*;

class Main_B1246 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] price = new int[M];
        for(int i=0; i<M; i++){
            price[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(price);

        int maxSum = 0;
        int maxPrice = 0;
        for(int i=0; i<M; i++){
            int now = price[i];
            int sum = Math.min(N, (M-i)) * now;            
            
            if(sum > maxSum){
                maxSum = sum;
                maxPrice = price[i];
            }
        }
        System.out.println(maxPrice + " " + maxSum);
        br.close();
    }
}
