class Solution {
    public String solution(String s, int n) {
        String answer = "";
        n = n%26;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isLowerCase(ch)){
                ch = (char)(ch+n);
                if(!Character.isLowerCase(ch))
                    ch -= 26;
            }
            if(Character.isUpperCase(ch)){
                ch = (char)(ch+n);
                if(!Character.isUpperCase(ch))
                    ch -= 26;
            }
            answer += ch;
        }
        return answer;
        
        
        
    }
}
