import java.util.stream.*;

class Solution {
    public int solution(int[] arr, int idx) {
        /*
        int answer = -1;
        for(int i=idx; i<arr.length; i++){
            if(arr[i]==1) return i;
        }
        return answer;
        */
        
        return IntStream.range(idx, arr.length).filter(i->arr[i]==1).findFirst().orElse(-1);
    }
}
