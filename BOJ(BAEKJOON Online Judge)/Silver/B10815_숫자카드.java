import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_B10815 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(br.readLine());
        int[] arr = new int[num1];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<num1; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int num2 = Integer.parseInt(br.readLine());
        int n = 0;
        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<num2; i++){
            n = Integer.parseInt(st.nextToken());
            System.out.print(binarySearch(arr, n)+ " ");
        }
        
        br.close();
    }
    public static int binarySearch(int[] arr, int n){
        int s = 0, e = arr.length-1;
        int index = 0;
        while(s<=e){
            index = (s+e)/2;
            if(arr[index] == n) return 1;
            if(arr[index] < n){
                s = index+1;
            }
            else {
                e = index-1;
            }
        }
        return 0;
    }
    
}
