import java.util.List;
import java.util.ArrayList;

class Solution {
    public String[] solution(String my_string) {
        
        // return my_string.split(" ");
        
        List<String> list = new ArrayList<>();
        String str = my_string + " ";
        int s = 0;
        for(int i=0 ;i<str.length(); i++){
            if(str.charAt(i) == ' '){
                list.add(str.substring(s, i));
                s = i+1;
            }
        }
        
        String[] answer = new String[list.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = list.get(i);
        }
        
        return answer;
        
    }
}
