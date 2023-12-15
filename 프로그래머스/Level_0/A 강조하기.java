import java.util.Arrays;
import java.util.stream.*;

class Solution {
    public String solution(String myString) {
        myString = myString.toLowerCase();
        return Arrays.stream(myString.split(""))
                     .map(i -> i.equals("a")?"A":i)
                     .collect(Collectors.joining());

    }
}
