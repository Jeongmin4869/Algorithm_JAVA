// 한 번 참이 되면 계속 참인 형태가 이분탐색의 대표적인 패턴

import java.util.*;

class Solution {
    public long solution(int n, int[] times) {
        long answer = 0;
        Arrays.sort(times);
                
        long s = 0; 
        long e = times[times.length - 1] * n;
        while(s<=e){
            long mid = (s+e)/2;
            long sum = 0;
            for(int time : times){
                sum += mid / time;
            }
            if(sum < n) s = mid+1;
            else e = mid-1;
            
        }
        
        answer = s;
        return answer;
    }
}
