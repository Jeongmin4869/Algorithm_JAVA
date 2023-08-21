class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        for(int i=0; i<my_string.length(); i++){
            char c = my_string.charAt(i);
            if (c <= 'Z')
                answer[c-'A'] += 1;
            else 
                answer[c-'a'+26] += 1;
        }
        return answer;
    }
}
