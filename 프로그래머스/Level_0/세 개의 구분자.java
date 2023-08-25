import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        String[] answer = {} ;
        String[] sp = myStr.split("[a|b|c]");
        ArrayList<String> list = new ArrayList<String>();
        
        for(int i=0; i<sp.length; i++){
            if(!sp[i].equals("") ) list.add(sp[i]);
        }
        
        answer = list.toArray(new String[list.size()]);
        if(answer.length == 0){
            answer = new String[1];
            answer[0] = "EMPTY";
        }
        return answer;
    }
}
