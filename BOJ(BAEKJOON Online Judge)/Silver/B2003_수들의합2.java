import java.util.*;
import java.io.*;

class Main_B2003 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int count = 0;
        int l=0, r=0;
        int sum = 0;
        while(l<N){
            if(r<N && sum < M){
                sum += arr[r];
                r += 1;
            }     
            else{
                sum -= arr[l];
                l += 1;
            }       
            if(sum == M){
                count += 1;               
            }            
        }
        System.out.println(count);
    } 
}
