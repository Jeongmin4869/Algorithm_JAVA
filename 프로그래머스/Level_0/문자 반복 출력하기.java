import java.util.stream.*;

class Solution {
    public String solution(String my_string, int n) {
        //return IntStream.range(0, my_string.length()*n).mapToObj(i -> my_string.charAt(i/n)).map(String::valueOf).collect(Collectors.joining());
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<my_string.length(); i++){
            sb.append(String.valueOf(my_string.charAt(i)).repeat(n));
        }
        return sb.toString();
    }
}
