import java.util.stream.*;
import java.util.Arrays;
class Solution {
    public int solution(int n) {
        //return (int)Arrays.stream(Integer.toString(n).split("")).mapToInt(Integer::parseInt).sum();
        int answer = 0;
        while(n>0){
            answer += n%10;
            n /= 10;
        }
        return answer;
    }
}
