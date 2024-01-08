import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public int[] solution(String my_string) {
        /*
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<my_string.length(); i++){
            if(Character.isDigit(my_string.charAt(i))) list.add(my_string.charAt(i)-'0');
        }
        
        int[] answer = new int[list.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = list.get(i);
        }
        
        Arrays.sort(answer);
        
        return answer;
        */

        return Arrays.stream(my_string.replaceAll("[A-Z|a-z]","").split("")).mapToInt(i -> Integer.parseInt(i)).sorted().toArray();
        
    }
}
