import java.util.Map;
import java.util.HashMap;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] arr = my_string.split("");
        Map<String, Integer> map = new HashMap<>();
        for(String str : arr){
            if(map.containsKey(str)) continue;
            map.put(str, 0);
            answer += str;
        }
        return answer;
    }
}
