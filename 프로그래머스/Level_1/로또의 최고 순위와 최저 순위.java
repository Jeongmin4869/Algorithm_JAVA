import java.util.Arrays;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {0,0};
        
        for(int i=0; i<lottos.length; i++){
            if(lottos[i] == 0){
                answer[0]++;
            }
            for(int j=0; j<win_nums.length; j++){
                if(lottos[i] == win_nums[j]){
                    answer[0]++;
                    answer[1]++;
                    break;
                }
    
            }
        }
        
        for(int i=0; i<answer.length; i++){
            answer[i] = 7-answer[i] < 7 ? 7-answer[i] : 6;
        }   
        
        return answer;
    }
}
