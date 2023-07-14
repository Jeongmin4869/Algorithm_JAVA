import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        char[][] types = {{'R', 'T'}, {'C', 'F'}, {'J', 'M'}, {'A','N'}};
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        
        for(char[] type : types){
            map.put(type[0], 0);
            map.put(type[1], 0);
        }
        
        for(int i=0; i<survey.length; i++){
            int choice = choices[i];
            if(choice < 4){
                map.put(survey[i].charAt(0), map.get(survey[i].charAt(0)) + 4 - choice);
            }
            else if(choice > 4){
                map.put(survey[i].charAt(1), map.get(survey[i].charAt(1)) + choice - 4);
            }
        }

        for(char[] type : types){
            if(map.get(type[0]) >= map.get(type[1])){
                answer += type[0];
            }
            else {
                answer += type[1];
            }
        }      
        return answer;
    }
}
