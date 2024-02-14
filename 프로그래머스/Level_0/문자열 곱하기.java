import java.util.stream.*;
import java.util.*;

class Solution {
    public String solution(String my_string, int k) {
        
        //return IntStream.range(0, k).mapToObj(i -> my_string).collect(Collectors.joining());
        //return my_string.repeat(k);
        
        return String.join("", Collections.nCopies(k, my_string));
        
    }
}
