import java.util.stream.*;
import java.util.Arrays;

class Solution {
    public int solution(String num_str) {
        /*
        String[] str = num_str.split("");
        int answer = 0;
        
        for(int i=0; i<str.length; i++){
            answer += Integer.parseInt(str[i]);
        }
        
        return answer;
        */
        
        /*
        return Arrays.stream(num_str.split(""))
                        .mapToInt(Integer::parseInt)
                        .sum();
        */
        
        return num_str.chars().map(i->i-'0').sum();
        
    }
}
