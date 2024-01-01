import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.stream.*;

class Solution {
    public int[] solution(String myString) {
        
        /*
        // 파라미터 limit으로  -1을 추가하는 것의 큰 차이는 문자열이 공백으로 끝날때의 공백을 취득하냐 여부
        String[] str =  myString.split("x", -1); // myString.split("x", myString.length());
        int[] answer = new int[str.length];
        for(int i=0; i<str.length; i++){
            answer[i] = str[i].length();
        }
        
        return answer;
        */
        
        return Arrays.stream(myString.split("x", -1)).mapToInt(str -> str.length()).toArray();
    }
}
