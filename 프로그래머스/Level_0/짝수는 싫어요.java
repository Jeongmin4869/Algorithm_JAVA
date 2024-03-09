//import java.util.stream.*;

class Solution {
    public int[] solution(int n) {
        // return IntStream.rangeClosed(1, n).filter(i -> i%2==1).toArray();
        int[] answer = new int[(n+1)/2];
        for(int i=0; i<answer.length; i++){
            answer[i] = i*2+1;
        }
        return answer;
    }
}
