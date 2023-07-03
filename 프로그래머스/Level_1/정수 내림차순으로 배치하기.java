import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = 0;
        String str = Long.toString(n);
        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        str = new StringBuilder(new String(ch)).reverse().toString();
        answer = Long.parseLong(str);
      
        return answer;
    }
}
