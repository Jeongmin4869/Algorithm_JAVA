class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int[] score = {0,0,0};
        int idx = 0;
        for(int i=0; i<dartResult.length(); i++){
            if(dartResult.charAt(i) >= '0' && dartResult.charAt(i) <= '9'){
                if(dartResult.charAt(i+1) == '0'){
                    score[idx] = 10;
                    i++;
                }
                else {
                    score[idx] = dartResult.charAt(i) - '0';
                }
                idx += 1;
                continue;
            }
            
            switch(dartResult.charAt(i)){
                case 'D':
                    score[idx-1] = score[idx-1] * score[idx-1];
                    break;
                case 'T':
                    score[idx-1] = score[idx-1] * score[idx-1] * score[idx-1];
                    break;
                case '*':
                    score[idx-1] *= 2;
                    if(idx - 2 >= 0) score[idx-2] *= 2;
                    break;
                case '#':
                    score[idx-1] *= -1;
                    break;
            }
        }
        return score[0] + score[1] + score[2];
    }
}
