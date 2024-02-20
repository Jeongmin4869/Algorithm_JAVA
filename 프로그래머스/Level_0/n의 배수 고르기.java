import java.util.stream.*;
import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n, int[] numlist) {
        //return IntStream.of(numlist).filter(i -> i%n==0).toArray();
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<numlist.length; i++){
            if(numlist[i]%n==0) list.add(numlist[i]);
        }
        int[] answer = new int[list.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}
