class Solution {
    public String removeDigit(String number, char digit) {
        String answer = "";
        int N = number.length();
        for(int i=0; i<N; i++){
            char c = number.charAt(i);
            if(c == digit){
                if(i+1 < N && c < number.charAt(i+1)){
                    return  number.substring(0, i) + number.substring(i+1);
                }
            }
        }

        int index=number.lastIndexOf(digit); // 가장 마지막 index return
        return number.substring(0, index) + number.substring(index+1);
    }
}
