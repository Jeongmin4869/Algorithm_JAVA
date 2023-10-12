import java.util.*;

class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int middle = total%num == 0 ? total/num : total/num+1;       
        int start = middle-(num/2);
        for(int i=0; i<num; i++){
            answer[i] = start++;
        }
        return answer;
    }
}
