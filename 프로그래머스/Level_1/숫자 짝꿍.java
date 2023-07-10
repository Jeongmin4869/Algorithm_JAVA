import java.util.*;
class Solution {
    public String solution(String X, String Y) {
        // string에 +연산은 string객체를 새로 만드는 것. 그래서 여러번 +연산이 일어나면 효율이 떨어진다. 
        StringBuilder answer = new StringBuilder();
        int[] arrX = {0,0,0,0,0,0,0,0,0,0};
        int[] arrY = {0,0,0,0,0,0,0,0,0,0};
        for(int i=0; i<X.length(); i++) arrX[X.charAt(i) - '0'] += 1;
        for(int i=0; i<Y.length(); i++) arrY[Y.charAt(i) - '0'] += 1;
        
        for(int i=9; i>=0; i--){
            if(arrX[i] != 0 && arrY[i] != 0){
                int min = Math.min(arrX[i], arrY[i]);
                while(min > 0){
                    min -= 1;
                    answer.append(Integer.valueOf(i));
                }
            }
        }
        
        // String ans = answer.toString();
        // if(ans.charAt(0) == '0') return "0"; // 왜안돼..?
        if("".equals(answer.toString())) return "-1";
        if(answer.toString().charAt(0) == '0') return "0";
        return answer.toString();
    }
}
