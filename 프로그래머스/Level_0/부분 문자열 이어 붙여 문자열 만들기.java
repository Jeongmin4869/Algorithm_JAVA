import java.util.stream.IntStream;
import java.util.stream.Collectors;
class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        /*
        String answer = "";
        int N = my_strings.length;
        for(int i=0; i<N; i++){
            answer += my_strings[i].substring(parts[i][0], parts[i][1]+1);
        }
        return answer;
        */
        
        return IntStream.range(0, my_strings.length).mapToObj(i-> my_strings[i].substring(parts[i][0], parts[i][1]+1)).collect(Collectors.joining());
        
    }
}
