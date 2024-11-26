import java.util.*;
import java.io.*;

class Main_B1731 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        int result;

        if(arr[2]-arr[1] == arr[1]-arr[0]){
            result = arr[n-1] + (arr[1]-arr[0]);
        } 
        else {
            result = arr[n-1] * (arr[1]/arr[0]);
        }

        System.out.print(result);
    }
}
