import java.util.*;
import java.lang.*;
import java.io.*;

class Main_B2491 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
           arr[i] = Integer.parseInt(st.nextToken());
        }
        
        int[] a = new int[N];
        Arrays.fill(a,1);
        int fre = arr[0];
        for(int i=1; i<N; i++){
           if(fre <= arr[i]){
               a[i] = a[i-1]+1;
               
           }
            fre = arr[i];
        }

        int[] b = new int[N];
        Arrays.fill(b,1);
        fre = arr[N-1];
        for(int i=N-2; i>=0; i--){
           if(fre <= arr[i]){
               b[i] = b[i+1]+1;
           }
            fre = arr[i];
        }

        Arrays.sort(a);
        Arrays.sort(b);
        System.out.println(Math.max(a[N-1], b[N-1]));
    }
}
