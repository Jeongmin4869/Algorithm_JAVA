class Solution {
    public String solution(String phone_number) {
        String answer;
        // 주어진 문자열을 문자 어레이로 변환
        char[] ch = phone_number.toCharArray();
        for(int i=0; i<ch.length-4; i++){
            ch[i] = '*';
        }
        // 문자 어레이를 다시 문자열로 변환
        answer = String.valueOf(ch);
        return answer;
    }
}
