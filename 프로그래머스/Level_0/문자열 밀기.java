
class Solution {
    public int solution(String A, String B) {
        int answer = -1;
        String str = A;
        int i = 0;
        for(i=0; i<A.length() ;i++){
            answer++;
            if(str.equals(B)) break;
            str = str.charAt(A.length()-1) + str.substring(0, A.length()-1);
        }
        if(i == A.length()) return -1;      
        return answer;
    }
}
