import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        int[] answer;
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(String str : operations){
            String[] arr = str.split(" ");
            String c = arr[0];
            int num = Integer.parseInt(arr[1]);
            if(c.equals("I")){
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
            if(c.equals("D") && num == 1 && !map.isEmpty()){
                int maxkey = map.lastKey();
                if(map.get(maxkey) == 1) map.remove(maxkey);
                else map.put(maxkey, map.get(maxkey)-1);
            }
            if(c.equals("D") && num == -1 && !map.isEmpty()){
                int minkey = map.firstKey();
                if(map.get(minkey) == 1) map.remove(minkey);
                else map.put(minkey, map.get(minkey)-1);
            }
        }
        
        if(map.isEmpty()) answer = new int[]{0,0};
        else answer = new int[]{map.lastKey(),map.firstKey()};
                
        return answer;
    }
}
