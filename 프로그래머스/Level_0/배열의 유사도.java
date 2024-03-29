import java.util.List;
import java.util.Arrays;

class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        /*
        for(String str1 : s1){
            for(String str2 : s2){
                answer += str1.equals(str2)?1:0;
            }
        }
        */
        List<String> list = Arrays.asList(s2);
        for(String str : s1){
            answer += list.contains(str)?1:0;
        }
        
        return answer;
    }
}
