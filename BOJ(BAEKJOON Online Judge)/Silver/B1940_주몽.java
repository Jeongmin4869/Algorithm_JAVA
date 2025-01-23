import java.util.*;
import java.io.*;

class Main_B1940 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long M = Long.parseLong(br.readLine());

        long[] arr = new long[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            arr[i] = Long.parseLong(st.nextToken());
        }

        Arrays.sort(arr);

        int l=0, r=N-1;
        long sum = 0;
        long count = 0;
        while(l<r){

            sum = arr[l] + arr[r];

            if(sum == M){
                count += 1;
                l+=1;
                r-=1;
            }
            else if(sum<M){
                l+=1;
            }
            else{
                r -= 1;
            }
        }
        
        System.out.println(count);
    }
}
