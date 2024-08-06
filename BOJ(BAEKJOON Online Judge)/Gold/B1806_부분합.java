import java.util.*;
import java.io.*;

class Main_B1806 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        long S= Long.parseLong(st.nextToken());
        int[] arr = new int[N];
         st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        
        int s =0, e=0;
        long sum = 0;
        int min = Integer.MAX_VALUE;

        while(s<=e){
            if(sum >= S){
                min = Math.min(min, e-s);
                sum -= arr[s++];
            }else if(e==N){
                break;
            }else{
                sum += arr[e++];
            }
        }

        if(min==Integer.MAX_VALUE) System.out.println(0);
        else System.out.println(min);
    }
}
