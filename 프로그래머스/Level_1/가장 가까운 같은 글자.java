import java.util.Map;
import java.util.HashMap;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        Map<Character, Integer> m = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            Character c = s.charAt(i);
            answer[i] = i - m.getOrDefault(c, i+1);
            m.put(c, i);
        }
        return answer;
    }
}
