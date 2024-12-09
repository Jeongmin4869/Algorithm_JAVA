import java.util.*;
import java.io.*;

class Main_B1448{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(nums);
        int result = -1;

        for(int i=n-1; i>=2; i--){
            int a = nums[i-2];
            int b = nums[i-1];
            int c = nums[i];
            if((a+b)>c){
                result = a+b+c;
                break;
            }
        }
        
        System.out.println(result);
        br.close();
    }
}
