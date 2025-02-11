import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int index = 0;
        int maxval = -1;
        StringTokenizer st ;
        for(int i=0; i<N; i++){
            int[] arr = new int[5];
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<5; j++){
                arr[j] = Integer.parseInt(st.nextToken());
            }
            int now = check(arr);
            if(now >= maxval){
                index = i+1;
                maxval = now;
            }            
        }
        
        System.out.println(index);
    }

    public static int check(int arr[]){
        int maxval = 0;
        for(int i=0; i<3; i++){
            for(int j=i+1; j<4; j++){
                for(int k=j+1; k<5; k++){
                    int sum = arr[i] + arr[j] + arr[k];
                    if(sum%10 > maxval){
                        maxval = sum%10;
                    }
                }
            }
        }
        return maxval;
    }
}
