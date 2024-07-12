import java.util.*;
import java.io.*;

class Main_B1912 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long[] nums = new long[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        nums[0]=Integer.parseInt(st.nextToken());
        long max = nums[0];
        for(int i=1; i<N; i++){
            int m = Integer.parseInt(st.nextToken());
            nums[i] = Math.max(nums[i-1]+m, m);
            max = Math.max(nums[i], max);
        }

        
        System.out.println(max);
    }
}
