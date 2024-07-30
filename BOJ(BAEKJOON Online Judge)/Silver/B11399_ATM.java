import java.util.*;
import java.io.*;

class Main_B11399 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long[] arr= new long[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<N; i++){
            arr[i]=Long.parseLong(st.nextToken());
        }

        Arrays.sort(arr);
        
        long count = arr[0];
        for(int i=1; i<N; i++){
            arr[i]+=arr[i-1];
            count+=arr[i];
        }
        
        
        System.out.print(count);

    }
}
