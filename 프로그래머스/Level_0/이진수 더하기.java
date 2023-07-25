class Solution {
    public String solution(String bin1, String bin2) {
        String answer = "";
        int num = Integer.parseInt(bin1, 2) + Integer.parseInt(bin2, 2);
        answer = Integer.toString(num, 2);
        return answer;
    }
}
