import java.util.List;
import java.util.ArrayList;
import java.util.stream.*;
class Solution {
    public int[] solution(int n) {
        int[] answer ;
        List<Integer> list = new ArrayList<>();
        while(true){
            list.add(n);
            if(n == 1)
                break;  
            n = n%2==0?n/2:n*3+1;                      
        }
        
        /*
        answer = new int[list.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = list.get(i);
        }
        return answer;
        */
        
        return list.stream().mapToInt(i->i).toArray();
        
    }
}
