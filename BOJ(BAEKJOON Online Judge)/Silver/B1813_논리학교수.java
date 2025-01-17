import java.util.*;
import java.io.*;

class Main_B1813 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        int[] counts = new int[50+1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            int num = Integer.parseInt(st.nextToken());
            counts[num] += 1;
        }

        int max = -1; // 이부분 포인트!
        for(int i=50; i>=0; i--){
            if(i==counts[i]){
                max = i;
                break;
            }
        }

        System.out.println(max);
    }
}
