import java.util.Map;
import java.util.HashMap;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        Map<Character, Integer> m = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            Character c = s.charAt(i);
            if(!m.containsKey(c)){
                answer[i] = -1;
                m.put(c, i);
            }
            else {
                answer[i] = i - m.get(c);
                m.put(c, i);
            }
        }
        
        return answer;
    }
}
