import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.*;

class Solution {
    
    // 모든 달은 28일까지 있다고 가정합니다.
    
    public int[] solution(String today, String[] terms, String[] privacies) {
        
        List<Integer> list = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        
        String[] today_s = today.split("[.]");
        int today_num = Integer.parseInt(today_s[0]) * 28 * 12  // 년도
                        + Integer.parseInt(today_s[1]) * 28 // 월
                        + Integer.parseInt(today_s[2]);
        
        for(int i=0; i<terms.length; i++){
            String[] str = terms[i].split(" ");
            map.put(str[0], Integer.parseInt(str[1]));
        }
        
        for(int i=0; i<privacies.length; i++){
            String[] privacy = privacies[i].split("[.]| ");
            
            int term = map.get(privacy[3]);
            
            int privacy_num = Integer.parseInt(privacy[0]) * 28 * 12  // 년도
                             + (Integer.parseInt(privacy[1])+term) * 28 // 월
                             + Integer.parseInt(privacy[2]);
            
            if(today_num >= privacy_num){
                list.add(i+1);
            }
        }
        
        return list.stream().mapToInt(i->i).toArray();
    }
}
