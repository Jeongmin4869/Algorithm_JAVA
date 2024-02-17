import java.util.stream.*;
import java.util.Arrays;
class Solution {
    public int solution(String my_string) {
        /*
        String str = my_string.replaceAll("[a-zA-z]","");
        return Arrays.stream(str.split("")).mapToInt(value -> Integer.parseInt(value)).sum();
        */
        
        return my_string.chars().mapToObj(i -> (char)i).filter(value -> Character.isDigit(value)).mapToInt(value -> value-'0').sum();
    }
}
