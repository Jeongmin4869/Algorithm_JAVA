import java.util.Arrays;
import java.util.stream.*;
class Solution {
    public int solution(int[] num_list, int n) {
        
        // return Arrays.asList(num_list).contains(num)?1:0; -> X
        return Arrays.stream(num_list).anyMatch(i->i==n)?1:0;
    }
}
