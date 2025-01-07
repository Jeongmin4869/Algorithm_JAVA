import java.util.*;
import java.io.*;

class Main_B1141 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];

        for(int i=0; i<n; i++){
            arr[i] = br.readLine();
        }

        Arrays.sort(arr, (o1, o2)->{
            return o2.length()-o1.length();
        });
        
        int result = 0;
        for(int i=0; i<n; i++){
            boolean isPrefix = false;
            for(int j=0; j<i; j++){
                if(arr[j].startsWith(arr[i])){
                    isPrefix = true;
                    break;
                }
            }
            if(!isPrefix) result += 1;
        }
        
        System.out.println(result);
    }
}
