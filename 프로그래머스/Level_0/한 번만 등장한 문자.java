import java.util.Map;
import java.util.TreeMap; // Key를 기준으로 자동정렬
import java.util.stream.Collectors;
import java.util.Arrays;

class Solution {
    public String solution(String s) {
        /*
        String answer = "";
        Map<Character,Integer> m = new TreeMap<>();
        for(int i=0 ; i< s.length(); i++){
            m.put(s.charAt(i),m.getOrDefault(s.charAt(i),0)+1);  
        }       

        for (Character key : m.keySet()) {
            if(m.get(key)==1) answer += key;
        }
        
        return answer;
        */
        
        return Arrays.stream(s.split(""))
            .collect(Collectors.groupingBy(s1 -> s1))
            .entrySet()
            .stream()
            .filter(entry -> entry.getValue().size() <= 1)
            .map(Map.Entry::getKey)
            .sorted()
            .collect(Collectors.joining());
        
    }
}
