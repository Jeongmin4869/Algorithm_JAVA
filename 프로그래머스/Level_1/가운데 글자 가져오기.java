class Solution {
    public String solution(String s) {
        int size = s.length();
        String answer = size%2==0? s.substring(size/2-1,size/2+1) : s.substring(size/2,size/2+1);
        return answer;
    }
}
