import java.util.stream.*;

class Solution {
    public int[] solution(int[] num_list) {
        return IntStream.rangeClosed(1, num_list.length).map(i -> num_list[num_list.length-i]).toArray();
        /*
        int[] answer = num_list.clone();
        for(int i=0; i<num_list.length; i++){
            answer[i] = num_list[num_list.length-1-i];
        }
        return answer;
        */
    }
}
