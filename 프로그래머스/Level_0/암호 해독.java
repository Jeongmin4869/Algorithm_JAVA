import java.util.stream.*;
class Solution {
    public String solution(String cipher, int code) {
       /*
        StringBuilder sb = new StringBuilder();
        for(int i=code-1; i<cipher.length(); i+=code){
            sb.append(cipher.charAt(i));
        }
        return sb.toString();
        */
        
        return IntStream.range(0, cipher.length()).filter(i->i%(code)==code-1).mapToObj(i->String.valueOf(cipher.charAt(i))).collect(Collectors.joining());
    }
}
