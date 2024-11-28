import java.util.*;
import java.io.*;

class Main_B1773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] nums = new int[N];
        for(int i=0; i<N; i++){
            nums[i] = Integer.parseInt(br.readLine());
        }

        int count = 0;
        for(int i=1; i<=M; i++){
            boolean flag = false;
            for(int j=0; j<N; j++){
                if(i % nums[j] == 0){
                    flag = true;
                    break;
                }
            }
            if(flag) count += 1;
        }
        
        System.out.print(count);
    }

}
