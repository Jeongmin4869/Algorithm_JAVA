import java.util.stream.*;

class Solution {
    public int solution(String number) {
        /*
        int answer = 0;
        String[] str = number.split("");
        for(String s : str){
            answer += Integer.parseInt(s);
        }
        return answer%9;
        */
        return number.chars().map(i -> i-'0').sum()%9;
    }
}
