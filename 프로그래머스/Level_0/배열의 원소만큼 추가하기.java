import java.util.List;
import java.util.ArrayList;
import java.util.stream.*;
import java.util.Collections;
import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr) {
        /*
        List<Integer> list = new ArrayList<>();
        for(int num : arr){
            for(int i=0; i<num; i++)
                list.add(num);
        }
        return list.stream().mapToInt(i->i).toArray();
        */
        
        return Arrays.stream(arr).boxed().flatMap(n -> Collections.nCopies(n,n).stream()).mapToInt(i->i).toArray();

    }
}

