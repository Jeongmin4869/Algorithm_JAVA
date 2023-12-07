import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public String solution(String myString) {
       
        return Arrays.stream(myString.split(""))
                    .map(i->(i.compareTo("l")<0?"l":i))
                    .collect(Collectors.joining());
        
    }
}
