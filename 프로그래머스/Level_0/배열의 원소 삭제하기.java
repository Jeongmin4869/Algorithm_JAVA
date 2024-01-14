import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        /*
        List<Integer> list = new ArrayList<>();
        for( int i : arr){
            list.add(i);
        }
        
        for(int d : delete_list){
            list.remove((Integer)d);
        }
        
        int[] answer = new int[list.size()];
        
        for(int i=0; i<answer.length; i++){
            answer[i] = list.get(i);
        }
        
        return answer;
        */
        
        // contains는 문자열 배열만 가능 ? ?
        return IntStream.of(arr).filter(i -> !IntStream.of(delete_list).anyMatch(j -> j == i)).toArray();
        
    }
}
