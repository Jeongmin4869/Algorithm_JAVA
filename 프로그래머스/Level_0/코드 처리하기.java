class Solution {
    public String solution(String code) {
        String answer = "";
        int mode = -1;
        for(int idx = 0; idx<code.length(); idx++){
            if(code.charAt(idx) == '1'){
                mode *= -1;
                continue;
            }
            
            if(mode == -1){
                if(idx%2==0) answer += code.charAt(idx);
            }
            else if (mode == 1){
                if(idx%2!=0) answer += code.charAt(idx);
            }
        }
        
        if(answer.length() == 0) answer = "EMPTY";
        
        return answer;
    }
}
