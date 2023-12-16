import java.util.Arrays;
import java.util.stream.*;

class Solution {
    public int solution(String myString, String pat) {
        
        
        //1. for문
        /*
        String str = "";
        
        for(int i=0; i<myString.length(); i++){
            if(myString.charAt(i) == 'A')
                str += "B";
            else 
                str += "A";
        }
        
        return str.contains(pat)?1:0;
        
        테스트 1 〉	통과 (2.42ms, 74.6MB)
        테스트 2 〉	통과 (2.25ms, 77.5MB)
        테스트 3 〉	통과 (2.04ms, 72.9MB)
        테스트 4 〉	통과 (2.00ms, 66.4MB)
        테스트 5 〉	통과 (2.15ms, 74.5MB)
        테스트 6 〉	통과 (2.12ms, 73.2MB)
        테스트 7 〉	통과 (2.45ms, 76MB)
        
        
        */
        
        // 2. stream
        
        String str = Arrays.stream(myString.split(""))
                           .map(i -> i.equals("A")?"B":"A")
                           .collect(Collectors.joining());
        return str.contains(pat)?1:0;
        
        /*
        테스트 1 〉	통과 (2.02ms, 69.5MB)
        테스트 2 〉	통과 (2.07ms, 75.6MB)
        테스트 3 〉	통과 (1.85ms, 77.6MB)
        테스트 4 〉	통과 (3.38ms, 69.9MB)
        테스트 5 〉	통과 (2.36ms, 76.8MB)
        테스트 6 〉	통과 (2.30ms, 71.5MB)
        테스트 7 〉	통과 (1.39ms, 75.3MB)
        */
        
        
    }
}
