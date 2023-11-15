import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution {
    public String solution(String str1, String str2) {
        /*
        String answer = "";
        for(int i=0; i<str1.length(); i++){
            answer += ""+ str1.charAt(i) + str2.charAt(i) ;
        }
        */
        
        return IntStream.range(0, str1.length())
                .mapToObj(i -> Character.toString(str1.charAt(i)) + str2.charAt(i))
                .collect(Collectors.joining());
    }
}
