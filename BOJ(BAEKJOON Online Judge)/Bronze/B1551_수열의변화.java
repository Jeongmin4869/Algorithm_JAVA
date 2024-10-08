import java.util.*;
import java.lang.*;
import java.io.*;

class Main_B1551{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr = Arrays.stream(br.readLine().split(",")).mapToInt(Integer::parseInt).toArray();

        for(int i=1; i<=k; i++){
            int[] before = arr.clone();
            for(int j=0; j<n-i; j++ ){
                arr[j] = arr[j+1]-arr[j];
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n-k; i++){
            sb.append(arr[i]);
            if(i<n-k-1) sb.append(",");
        }
        
        System.out.println(sb);
        br.close();
    }
}
