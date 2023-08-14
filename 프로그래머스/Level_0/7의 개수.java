
import java.util.*;
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        String str = "";
        for(int i=0; i<array.length; i++){
            str += Integer.toString(array[i]);
        }
        answer = (int)str.chars().filter(c->c=='7').count();
        return answer;
    }
}
