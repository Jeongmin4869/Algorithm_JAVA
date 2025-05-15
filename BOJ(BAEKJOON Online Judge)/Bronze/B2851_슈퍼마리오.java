import java.util.*;
import java.io.*;

class Main_B2851 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[11];
        for(int i=1; i<=10; i++){
            int num = Integer.parseInt(br.readLine());
            arr[i] = arr[i-1] + num;            
        }

        int result = 0;
        int maxd = 1000;            
        for(int i=1; i<11; i++){            
            int now = 100 - arr[i];
            if(Math.abs(now)<=maxd){
                maxd = Math.abs(now);
                result = arr[i];
            }
            else break;
        }

        System.out.print(result);
    
    }
}
