class Solution {
    public int solution(int n) {
        int answer = 0;
        int num = 1;
        String nstr = "";
        
        while(n > 0){
            nstr = Integer.toString(n%3) + nstr;
            n /= 3;
        }
        for(int i=0; i<nstr.length(); i++){
            answer += num * (nstr.charAt(i) - '0');
            num *= 3;
        }
        
        return answer;
    }
}
