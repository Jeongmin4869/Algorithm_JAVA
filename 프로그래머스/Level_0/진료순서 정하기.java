import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
class Solution {
    public int[] solution(int[] emergency) {
        /*
        int size = emergency.length;
        int[] answer = new int[size];
        int[] rank = emergency.clone();
        
        Arrays.sort(rank);
        for(int i=size-1; i>=0; i--){
            for(int j = 0; j<size; j++){
                if(rank[i] == emergency[j]) {
                    answer[j] = size-i;
                    break;
                }
            }
        }
        return answer;
        */
        
        return Arrays.stream(emergency)
                .map(i -> Arrays.stream(emergency)
                           .boxed()
                           .sorted(Comparator.reverseOrder())
                           .collect(Collectors.toList())
                           .indexOf(i) + 1
                ).toArray();
    }
}
