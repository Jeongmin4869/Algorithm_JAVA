import java.util.stream.*;

class Solution {
    public int[] solution(int start, int end_num) {
        // return IntStream.iterate(start, i-> i>=end_num, i-> i-1).toArray();
        return IntStream.rangeClosed(-start,-end_num).map(i->-i).toArray();
    }
}
