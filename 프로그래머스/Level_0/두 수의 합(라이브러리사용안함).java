import java.math.*;
class Solution {
    
    //bigInteger 사용 없이 해결
    
    public String solution(String a, String b) {
        String answer = "";
        int alen = a.length() -1;
        int blen = b.length() -1;
        int sum = 0;
        while(alen >= 0 || blen >= 0 || sum > 0){
            if(alen >= 0){
                sum += a.charAt(alen) - '0';
                alen --;
            }
            if(blen >= 0){
                sum += b.charAt(blen) - '0';
                blen --;
            }
            answer = Integer.toString(sum%10) + answer;
            sum = sum / 10;
        }
        return answer;  
    }  

}
