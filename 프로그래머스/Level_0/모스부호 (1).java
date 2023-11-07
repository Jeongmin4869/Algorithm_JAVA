import java.util.Arrays;

class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] morse = { 
            ".-","a","-...","b","-.-.","c","-..","d",".","e","..-.","f",
            "--.","g","....","h","..","i",".---","j","-.-","k",".-..","l",
            "--","m","-.","n","---","o",".--.","p","--.-","q",".-.","r",
            "...","s","-","t","..-","u","...-","v",".--","w","-..-","x",
            "-.--","y","--..","z"
        };
        
        String[] letters = letter.split(" ");
        for(String l : letters){
            if(l.length() == 0) continue;
            answer += morse[Arrays.asList(morse).indexOf(l)+1];
        }
        
        return answer;
    }
}
