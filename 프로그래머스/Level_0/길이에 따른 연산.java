import java.util.stream.*;

class Solution {
    public int solution(int[] num_list) {
        // return num_list.length>10?IntStream.of(num_list).sum():IntStream.of(num_list).reduce(1, (x, y) -> x * y);
        
        int length = num_list.length;
        int answer = length>10?0:1;
        for(int num : num_list){
            if(length>10)
                answer += num;
            else 
                answer *= num;
        }
        return answer;
    }
}
