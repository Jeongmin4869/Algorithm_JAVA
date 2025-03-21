/* 이분탐색 활용 */
import java.util.*;
import java.io.*;

class Main_B1072 {
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long X = Long.parseLong(st.nextToken());
        long Y = Long.parseLong(st.nextToken());
        long Z = Y*100 / X;
        if(Z >= 99){
            System.out.println(-1);
            return;
        }

        long left = 0;
        long right = X;
        long result = 0;
        while(left <= right){
            long mid = (left+right)/2;
            long now = (Y+mid)*100 / (X+mid);
            if(now > Z){
                result = mid;
                right = mid-1;
            }else {
                left = mid+1;
            }
        }

        System.out.println(result);
        br.close();
    }

}
