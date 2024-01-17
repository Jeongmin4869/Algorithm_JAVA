import java.util.stream.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        /*
        int len = num_list.length;
        int[] answer = new int[len];
        for(int i=0; i<num_list.length; i++){
            answer[i] = num_list[(n+i)%len];
        }
        return answer;
        */
        
        /*
        return IntStream.concat(IntStream.iterate(n, i->i<num_list.length, i-> i+1).map(i->num_list[i]),
                               IntStream.iterate(0, i->i<n, i-> i+1).map(i->num_list[i])).toArray();
        */
        
        return IntStream.range(0, num_list.length).map(i -> num_list[(n+i)%num_list.length]).toArray();
        
    }
}
