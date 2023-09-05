import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        int s, e, k;
        for(int i=0; i<queries.length; i++){
            s = queries[i][0];
            e = queries[i][1];
            k = queries[i][2];
            
            int[] arr2 = Arrays.copyOfRange(arr,s, e+1);
            Arrays.sort(arr2);
            answer[i] = -1;
            for(int j=0; j<arr2.length; j++){
                if(k < arr2[j]){
                    answer[i] = arr2[j];
                    break;
                }
            }
        }
        
        return answer;
    }
}
