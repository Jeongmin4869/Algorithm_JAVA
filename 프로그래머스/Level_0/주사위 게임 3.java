import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int solution(int a, int b, int c, int d) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(a, map.getOrDefault(a, 0) + 1);
        map.put(b, map.getOrDefault(b, 0) + 1);
        map.put(c, map.getOrDefault(c, 0) + 1);
        map.put(d, map.getOrDefault(d, 0) + 1);
        
        ArrayList<Integer> keys = new ArrayList<Integer>(map.keySet());
        Collections.sort(keys);
        if(map.size() == 1) return 1111 * keys.get(0);
        if(map.size() == 2) {
            if(map.get(keys.get(0)) == 2)
                return (keys.get(0) + keys.get(1)) * Math.abs(keys.get(0) - keys.get(1));
            if(map.get(keys.get(0)) == 1)
                return (10*keys.get(1) + keys.get(0)) * (10*keys.get(1) + keys.get(0));
            
            if(map.get(keys.get(1)) == 1)
                return (10*keys.get(0) + keys.get(1)) * (10*keys.get(0) + keys.get(1));
        }
        if(map.size() == 3){
            if(map.get(keys.get(0)) == 2)
                return keys.get(1)*keys.get(2);
            
            if(map.get(keys.get(1)) == 2)
                return keys.get(0)*keys.get(2);
            
            if(map.get(keys.get(2)) == 2)
                return keys.get(0)*keys.get(1);
        }
        return keys.get(0);
    }
}
