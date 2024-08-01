import java.util.*;
import java.io.*;

class Main_B3273 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long[] arr = new long[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            arr[i]=Long.parseLong(st.nextToken());
        }
        long X=Long.parseLong(br.readLine());
        
        Arrays.sort(arr);
        int s =0, e=N-1;
        int count = 0;
        while(s<e){
            long left = arr[s];
            long right = arr[e];
            long sum = left + right;
            if(sum == X){
                count +=1;
            }
            if(sum>X) e-=1;
            else s+=1;
        }
        System.out.println(count);
    }
}
