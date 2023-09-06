import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        ArrayList<Integer> list = new ArrayList<>();
        int index = 0;
        for(int i=0; i<arr.length; i++){
            if(!list.contains(arr[i])){
                list.add(arr[i]);
                answer[index++] = arr[i];
            }
            if(list.size() == k) break;
        }
        
        for(int j = list.size(); j<k; j++){
            answer[j] = -1;
        }
        
        return answer;
    }
}
