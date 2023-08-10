class Solution {
    public int solution(String s) {
        int answer = 0;
        char c = ' ';
        int cnt1 = 0, cnt2 = 0;
        for(int i=0; i<s.length(); i++){
            if(c == ' '){
                c = s.charAt(i);
                cnt1 = 1;
                continue;
            }
            
            if(c == s.charAt(i)){
                cnt1 += 1;
            }
            else if(c != s.charAt(i)){
                cnt2 += 1;
            }
            
            if(cnt1 == cnt2){
                answer += 1;
                cnt1 = 0;
                cnt2 = 0;
                c = ' ';
            }
        }
        
        if(cnt1 > 0) answer += 1;
        
        return answer;
    }
}
