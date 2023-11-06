import java.util.Map;
import java.util.HashMap;

class Solution {
    public int solution(String before, String after) {
        Map<Character, Integer> map = new HashMap<>();

        for(int i=0; i<before.length(); i++){
            map.merge(before.charAt(i), 1, Integer::sum);
        }
        
        for(int i=0; i<after.length(); i++){
            if(!map.containsKey(after.charAt(i))) 
                return 0;
            map.put(after.charAt(i), map.get(after.charAt(i))-1);
            if(map.get(after.charAt(i)) == 0)
                map.remove(after.charAt(i));
        }

        return 1;
    }
}
