class Solution {
    public String solution(int age) {
        String answer = "";
        /*
        // 1. 
        String[] alpha = {"a","b","c","d","e","f","g","h","i","j"};
        while(age >0){
            int index = age%10; 
            answer = alpha[index] + answer;
            age /= 10;
        }
        */

        // 2. 
        while(age >0){
            int index = age%10;
            answer = (char)('a'+index) + answer;
            age /= 10;
        }
      
        return answer;
    }
}
