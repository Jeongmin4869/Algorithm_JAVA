import java.util.*;
import java.io.*;

class Main_B1350 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] nums = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            nums[i] = Integer.parseInt(st.nextToken());
        }

        long size = Long.parseLong(br.readLine());
        long count = 0;

        for(int i=0; i<n; i++){
            count += nums[i]/size;
            if((nums[i]%size)!=0) count += 1;
            
        }
        
        System.out.println(count * size);
    }
}
