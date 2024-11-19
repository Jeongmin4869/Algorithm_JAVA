import java.util.*;
import java.io.*;

class Main_B1337 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr= new int[n];
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);
        int l=0, r=1;
        int min=4;
        while(l<=r){
            if(r==n) break;
            if(arr[r]-arr[l]<=4){
                min = Math.min(min,5-(r-l+1));
                r+=1;
            }
            else{
                l+=1;
            }
        }
        
        System.out.println(min);
        br.close();
    }
}
