import java.util.Arrays;

// 이중포문 제거

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {0,0};
        int[] rank = {6,6,5,4,3,2,1};
        Arrays.sort(win_nums);
        
        for(int i=0; i<lottos.length; i++){
            if(lottos[i] == 0){
                answer[0]++;
            }
            if(Arrays.binarySearch(win_nums, lottos[i])>=0){
                answer[0]++;
                answer[1]++;
            }
        }
        
        for(int i=0; i<answer.length; i++){
            answer[i] = rank[answer[i]];
        }   
        
        return answer;
    }
}
