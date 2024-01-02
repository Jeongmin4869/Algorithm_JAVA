class Solution {
    public String[] solution(String my_string) {
        String[] answer = my_string.replaceAll(" +"," ").trim().split(" ");
        return answer;
    }
}
