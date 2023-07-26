/*
class Solution {
    public int solution(String s) {
        int answer = 0;
        String sum = "";
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == ' '){
                if(s.charAt(i+1) == 'Z')
                    i+=2;
                else 
                    answer += Integer.parseInt(sum);
                sum = "";
            }
            else 
                sum += Character.toString(s.charAt(i));
        }
        
        if(sum.length() > 0) 
            answer += Integer.parseInt(sum);
        
        return answer;
    }
}

*/

import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        String[] str = s.split(" ");
        for(int i=0; i<str.length; i++){
            if(str[i].equals("Z")){
                stack.pop();
            }
            else {
                stack.push(Integer.parseInt(str[i]));
            }
        }
        
        for(int i: stack){
            answer += i;
        }
        
        return answer;
    }
}
