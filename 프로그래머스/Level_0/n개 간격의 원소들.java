import java.util.stream.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        /*
        int index = 0, size = num_list.length%n==0?num_list.length/n:num_list.length/n+1;
        int[] answer = new int[size];
        for(int i=0; i<num_list.length; i+=n){
            answer[index++] = num_list[i];
        }
        return answer;
        */
        
        //return IntStream.range(0, num_list.length).filter(i -> i%n == 0).map(i -> num_list[i]).toArray();
        
        return IntStream.iterate(0, i->i<num_list.length, i->i+n).map(i->num_list[i]).toArray();
    }
}
