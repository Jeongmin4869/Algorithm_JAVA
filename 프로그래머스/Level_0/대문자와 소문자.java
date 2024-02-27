import java.util.stream.*;
import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<my_string.length(); i++){
            char c = my_string.charAt(i);
            if(c < 'a') sb.append(Character.toLowerCase(c));
            else sb.append(Character.toUpperCase(c));
        }
        return sb.toString();
        
        //return my_string.chars().mapToObj(ch -> String.valueOf((char)(Character.isLowerCase(ch)?Character.toUpperCase(ch):Character.toLowerCase(ch)))).collect(Collectors.joining());
    }
}
