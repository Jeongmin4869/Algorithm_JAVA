import java.util.stream.IntStream;
import java.util.stream.Collectors;

class Solution {
    public String solution(String my_string, int m, int c) {
        /*
        String answer = "";
        for(int i=c-1; i<my_string.length(); i+=m){
            answer += my_string.charAt(i);
        }
        return answer;
        */
        
        return IntStream.range(0, my_string.length())
                        .filter(i->i%m==c-1)
                        .mapToObj(i -> String.valueOf(my_string.charAt(i)))
                        .collect(Collectors.joining());
        
    }
}
