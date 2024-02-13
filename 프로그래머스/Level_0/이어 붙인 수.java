import java.util.stream.*;
import java.util.Arrays;

class Solution {
    public int solution(int[] num_list) {
        /*String str1="", str2="";
        for(int i=0; i<num_list.length; i++){
            int num = num_list[i];
            if(num%2==0) str1 += Integer.toString(num);
            else str2 += Integer.toString(num);
        }
        
        return Integer.parseInt(str1) + Integer.parseInt(str2) ;
        */
        
        return Integer.parseInt(Arrays.stream(num_list).filter(value -> value%2==0).mapToObj(String::valueOf).collect(Collectors.joining())) + Integer.parseInt(Arrays.stream(num_list).filter(value -> value%2==1).mapToObj(String::valueOf).collect(Collectors.joining()));
        
    }
}
