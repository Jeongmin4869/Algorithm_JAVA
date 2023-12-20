import java.util.Arrays;
import java.util.stream.*;
class Solution {
    public String[] solution(String my_string) {
        /*
        String[] answer = new String[my_string.length()];
        String str = "";
        for(int i=answer.length-1; i>=0; i--){
            str = my_string.charAt(i) + str;
            answer[i] = str;
        }
        Arrays.sort(answer);
        return answer;
        */
        
        return IntStream.range(0, my_string.length())
                        .mapToObj(i -> my_string.substring(i))
                        .sorted()
                        .toArray(String[]::new);
        
        
    }
}
