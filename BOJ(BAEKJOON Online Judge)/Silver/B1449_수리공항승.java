import java.util.*;
import java.io.*;

class Main_B1449 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int s , e =0;
        int count =0;
        for(int i=0; i<N; i++){
            if(arr[i]>=e){
                count += 1;
                s=arr[i];
                e=arr[i]+L;
            }
        }
        
        System.out.println(count);
    }
}
