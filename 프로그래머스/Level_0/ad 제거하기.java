import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.*;

class Solution {
    public String[] solution(String[] strArr) {
        /*
        //1. forloof
        String[] answer ;
        List<String> list = new ArrayList<>();
        for(int i=0; i<strArr.length; i++){
            if(!strArr[i].contains("ad"))
                list.add(strArr[i]);
        }
        
        // stream은 실행시간이 오래걸리니 list -> array 라는것만 알아두기
        //return list.stream().toArray(String[]::new);
        
        
        answer = new String[list.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = list.get(i);
        }
        
        return answer;
        */

        // 2. stream -> 실행시간이 오래걸려 비효율적
        return Arrays.stream(strArr)
                     .filter( i-> !i.contains("ad"))
                     .toArray(String[]::new);
        
    }
}
