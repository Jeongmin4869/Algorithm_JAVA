/*
import java.util.Arrays;
class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        int[][] arr = new int[numlist.length][2];
        
        for(int i=0; i<numlist.length; i++){
            arr[i][0] = Math.abs(numlist[i]-n);
            arr[i][1] = numlist[i];
        }
        
        Arrays.sort(arr, (o1, o2) -> {
            if(o1[0] == o2[0]) 
                return Integer.compare(o2[1], o1[1]);
            else 
                return Integer.compare(o1[0], o2[0]);
        });
        
        for(int i=0; i<arr.length; i++){
            answer[i] = arr[i][1];
        }
        
        return answer;
    }
}
*/

import java.util.Arrays;
class Solution {
    public int[] solution(int[] numlist, int n) {
        
        return Arrays.stream(numlist)
            .boxed()
            .sorted((a,b) -> Math.abs(a-n) == Math.abs(b-n) ? b.compareTo(a) : Integer.compare(Math.abs(a-n), Math.abs(b-n)))
            .mapToInt(Integer :: intValue)
            .toArray();
        
    }
}

