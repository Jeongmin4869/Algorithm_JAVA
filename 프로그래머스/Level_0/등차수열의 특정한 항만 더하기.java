import java.util.stream.IntStream;

class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        
        answer = IntStream.range(0, included.length)
                          .map(i -> included[i] ? a+d*i : 0)
                          .sum();
        
        return answer;
    }
}
