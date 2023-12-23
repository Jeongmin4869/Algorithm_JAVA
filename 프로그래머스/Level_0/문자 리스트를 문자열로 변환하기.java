import java.util.stream.*;
import java.util.Arrays;

class Solution {
    public String solution(String[] arr) {
        /*
        String answer = "";
        for(String s : arr){
            answer += s;
        }
        return answer;
        */
        
        //return Arrays.stream(arr).collect(Collectors.joining());
        
        // Java8에는 String.join() 메서드가 추가되었다. 
        return String.join("", arr);
        
    }
}
