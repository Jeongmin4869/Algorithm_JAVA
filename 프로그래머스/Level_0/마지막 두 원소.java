import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int N = num_list.length;
        int[] answer = Arrays.copyOf(num_list, N+1);
        answer[N] = answer[N-1]>answer[N-2]?answer[N-1]-answer[N-2]:answer[N-1]*2;
        return answer;
    }
}
