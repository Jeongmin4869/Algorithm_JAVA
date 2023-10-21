import java.util.Arrays;
class Solution {
    public int[] solution(int[] emergency) {
        int size = emergency.length;
        int[] answer = new int[size];
        int[] rank = emergency.clone();
        
        Arrays.sort(rank);
        for(int i=size-1; i>=0; i--){
            for(int j = 0; j<size; j++){
                if(rank[i] == emergency[j]) answer[j] = size-i;
            }
        }
        
        return answer;
    }
}
