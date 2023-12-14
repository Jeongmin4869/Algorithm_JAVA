import java.util.Arrays;
import java.util.stream.*;

class Solution {
    public String[] solution(String[] names) {
        
        return IntStream.range(0, names.length)
                        .filter( i -> (i+1)%5==1)
                        .mapToObj( i -> names[i])
                        .toArray(String[]::new);
    }
}
