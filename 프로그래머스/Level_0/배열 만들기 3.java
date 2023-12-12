import java.util.Arrays;
import java.util.ArrayList;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<intervals.length; i++){
            for(int j = intervals[i][0]; j<=intervals[i][1]; j++){
                list.add(arr[j]);
            }
        }
        /*
        return IntStream.range(0, list.size())
                    .map(i -> list.get(i))
                    .toArray();
        */
        
        int[] answer = new int[list.size()];
        for(int i=0;i<list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}
