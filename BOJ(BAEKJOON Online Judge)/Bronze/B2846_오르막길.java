import java.util.*;
import java.io.*;

class Main_B2846 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n+1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int left = arr[0];
        int max = 0;
        for(int i=0; i<n; i++){
            if(arr[i]>=arr[i+1]){
                max = Math.max(max, arr[i]-left);
                left = arr[i+1];
         
            }
        }
        System.out.print(max);
    }
}
