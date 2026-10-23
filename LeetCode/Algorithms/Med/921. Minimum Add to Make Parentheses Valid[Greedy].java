class Solution {
    public int minAddToMakeValid(String s) {
        int left = 0;  // 짝을 찾지 못한 여는 괄호 '(' 개수
        int right = 0; // 짝이 없어 추가해야 하는 여는 괄호 '(' 개수

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(') {
                left += 1; // 짝을 기다리는 여는 괄호 증가
            } else {
                if (left > 0) {
                    left -= 1; // 기존 여는 괄호와 짝을 맞춤
                } else {
                    right += 1; // 짝이 없으므로 여는 괄호 추가 필요
                }
            }
        }

        // 남은 여는 괄호에는 닫는 괄호를 추가하고,
        // 짝이 없던 닫는 괄호에는 여는 괄호를 추가
        return left + right;
    }
}
