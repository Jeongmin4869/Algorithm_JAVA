import java.util.stream.*;
class Solution {
    public String solution(int q, int r, String code) {

        //return IntStream.range(0, code.length()).filter(c->c%q==r).mapToObj(i->String.valueOf(code.charAt(i))).collect(Collectors.joining());
        
        String answer = "";
        for(int i=0; i<code.length(); i++){
            if(i%q==r) answer += Character.toString(code.charAt(i));
        }
        return answer;
    }
}
