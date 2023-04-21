class Solution {
    public String solution(int n) {
        String answer = "";
        while(answer.length() + 2 <= n){
            answer += "수박";
        }        
        return answer.length() < n ? answer+"수" : answer;
    }
}
