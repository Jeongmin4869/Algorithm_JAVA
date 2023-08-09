import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer ;
        int start = 100000;
        int end = 0;
      
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 2){
                start = i;
                break;
            }
        }
        
        for(int i=arr.length-1; i>=0; i--){
            if(arr[i] == 2){
                end = i;
                break;
            }
        }
        
        if(start == 100000) {
            answer = new int[1];
            answer[0] = -1;
            return answer;
        }

        answer = Arrays.copyOfRange(arr, start, end+1);
        return answer;
    }
}
