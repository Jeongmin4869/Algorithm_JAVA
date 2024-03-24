import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        Map<Character, Integer> map = new HashMap<>();
        char key;
        Boolean flag = true;
        
        for(int i=0; i<keymap.length; i++){
            for(int j=0; j<keymap[i].length(); j++){
                key = keymap[i].charAt(j);
                map.put(key, Math.min(map.getOrDefault(key, 101), j+1));
            }
        }
        
        for(int i=0; i<targets.length; i++){
            int sum = 0;
            flag = true;
            for(int j=0; j<targets[i].length(); j++){
                key = targets[i].charAt(j);
                if(!map.containsKey(key)){
                    flag = false;
                    break;
                }
                sum += map.get(targets[i].charAt(j));
            }
            answer[i] = !flag?-1:sum;
        }
        
        return answer;
    }
}
