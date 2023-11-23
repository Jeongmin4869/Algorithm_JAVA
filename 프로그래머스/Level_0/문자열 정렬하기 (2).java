import java.util.*;

class Solution {
    public String solution(String my_string) {
        /*
        String answer = "";
        my_string = my_string.toLowerCase();
        String[] arr = my_string.split("");
        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++){
            answer += arr[i];
        }
        */
        char[] ch = my_string.toLowerCase().toCharArray();
        Arrays.sort(ch);
        return new String(ch);
    }
}
