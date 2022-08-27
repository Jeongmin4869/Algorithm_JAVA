import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
        int value = 10;
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0; i < arr.length; i++){
            if(arr[i] != value){
                list.add(arr[i]);
                value = arr[i];
            }
        }
        int[] answer = list.stream().mapToInt(i->i).toArray();
        return answer;
    }
}
