import java.util.*;

// set 값이 중복되지 않는다. 순서가 없다. 

class Solution {
    public int[] solution(int n) {
        int[] answer ;
        Set<Integer> set = new HashSet<>();
        int num=2;
        while(n>1){
            if(n%num == 0){
                n/=num;
                set.add(num);
            }
            else {
                num += 1;
            }
        }

        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        answer = new int[set.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}
