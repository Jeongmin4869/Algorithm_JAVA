class Solution {
    public int solution(String s) {
        int answer = 0;
        Boolean sign = true;
        //answer = Integer.valueOf(s);
        for(int i=0; i< s.length(); i++){
            char c = s.charAt(i);
            if(c == '-') sign = false;
            else if(c != '+') 
                answer = answer * 10 + (c-'0');
        }
        
        return sign==true?answer:answer*-1;
    }
}
