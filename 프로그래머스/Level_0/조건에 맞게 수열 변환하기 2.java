import java.util.*;

class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int[] prearr = arr.clone();
        while(true){
            answer += 1;
            for(int i=0; i<arr.length; i++){
                if(arr[i] % 2 == 0 && arr[i] >= 50) arr[i]/=2;
                else if (arr[i] % 2 !=  0 && arr[i] < 50) arr[i] = arr[i] * 2 + 1;
            }
            if(Arrays.equals(arr, prearr)){
                break;
            }
            prearr = arr.clone();
        }
        return answer-1;
    }
}
