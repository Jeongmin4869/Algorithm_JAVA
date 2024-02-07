import java.util.HashMap;
import java.util.stream.*;
import java.util.Arrays;
class Solution {
    public int solution(int n, String control) {
        
        //int answer = n;
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('w', 1);
        map.put('s', -1);
        map.put('d', 10);
        map.put('a', -10);
        /*
        for(int i=0; i<control.length(); i++){
            char c = control.charAt(i);
            answer += map.get(c);
        }
        return answer;
        */
        return IntStream.range(0, control.length()).map(i -> map.get(control.charAt(i))).sum()+n;
        
    }
}
