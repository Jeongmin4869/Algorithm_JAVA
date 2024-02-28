import java.util.stream.*;

class Solution {
    public int solution(int[] num_list) {
        
        return Math.pow(IntStream.of(num_list).sum(),2) > IntStream.of(num_list).reduce(1, (x, y) -> x * y)?1:0;
    }
}
