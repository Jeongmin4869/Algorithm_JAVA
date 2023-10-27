import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;
class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        List<Integer> list = Arrays.stream(indices)
                              .boxed()
                              .collect(Collectors.toList());
        
        for(int i=0; i<my_string.length(); i++){
            if(list.contains(i)) continue;
            answer += my_string.charAt(i);
        }
        
        return answer;

    }
}
