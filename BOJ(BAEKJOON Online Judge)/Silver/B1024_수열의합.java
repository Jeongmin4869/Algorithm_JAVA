/*Tow Pointer -> Too slow */

import java.util.*;

class Main_B1024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long L = sc.nextLong();

        long left = 0, right = 1;
        long sum = 0;
        long[] pointer = new long[]{0,0};
        while(right <= N+1){
            if(right-left > 100){
                sum -= left;
                left += 1;
                continue;
            }

            if(sum<N){
                sum += right;
                right += 1;
            }
            else if(sum == N) {
                if(right-left >= L && 
                   ((pointer[1] - pointer [0] > right-left) || pointer[1] == 0)){
                    pointer = new long[]{left, right};
                }
                sum -= left;
                left += 1;
            }
            else {
                sum -= left;
                left += 1;
            }
            
        }
        
        if(pointer[1] == 0){
            System.out.println(-1);
        }
        else {
            StringBuilder sb = new StringBuilder();
            for(long i = pointer[0]; i < pointer[1]; i++){
                sb.append(i + " ");
            }
            System.out.println(sb);
        }
        
    }
}
