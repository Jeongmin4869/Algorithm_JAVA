class Solution {
    // [a-zA-Z0-9] : 알파벳과 숫자
    public int solution(String my_string) {
        int answer = 0;
        /*
        String num = "";
        my_string += 'A';
        for(int i=0; i<my_string.length(); i++){
            if(my_string.charAt(i) >= '0' && my_string.charAt(i) <= '9'){
                num += my_string.charAt(i);
                continue;
            }
            if(num.length() > 0){
                answer += Integer.parseInt(num);
                num = "";
            }
        }
        return answer;*/
        
        String[] nums = my_string.split("[a-zA-Z]");
        for(String num : nums){
            if(num.length() > 0)
                answer += Integer.parseInt(num);
        }
        
        return answer;
        
    }
}
