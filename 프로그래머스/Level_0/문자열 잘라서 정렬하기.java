import java.util.Arrays;
class Solution {
    public String[] solution(String myString) {
        myString = myString.replaceAll("x{1,}", " ");
        String[] answer = myString.trim().split(" ");
        Arrays.sort(answer);
        return answer;
    }
}
