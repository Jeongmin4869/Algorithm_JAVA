import java.util.stream.*;

class Solution {
    public int[] solution(int n, int k) {
        // return IntStream.iterate(k, i -> i<=n, i -> i+=k).toArray();
        int answer[] = new int[n/k];
        for(int i=0; i<answer.length; i++){
            answer[i] = (i+1)*k;
        }
        return answer;
    }
}
