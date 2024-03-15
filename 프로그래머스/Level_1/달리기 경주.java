import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        /*
        String[] answer = players.clone();
        for(String calling : callings){
            int index = Arrays.asList(answer).indexOf(calling);
            String temp = answer[index];
            answer[index] = answer[index-1];
            answer[index-1] = temp;
        }
        return answer;
        */
        String[] answer = players.clone();
        Map<String, Integer> map = new HashMap<>();
        for(int i=0; i<players.length; i++){
            map.put(players[i], i);
        }
        
        for(int i=0; i<callings.length; i++){
            int index = map.get(callings[i]);
            map.put(answer[index], map.get(answer[index])-1);
            map.put(answer[index-1], map.get(answer[index-1])+1);
            String temp = answer[index];
            answer[index] = answer[index-1];
            answer[index-1] = temp;
        }
        return answer;
    }
}
