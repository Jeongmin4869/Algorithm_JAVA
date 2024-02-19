import java.util.stream.*;

class Solution {
    public int[] solution(int[] arr, int n) {
        // XX
        // return IntStream.range(0, arr.length).map(i -> arr.length%2==0?((i+1)%2==0?arr[i]+n:arr[i]):((i+1)%2==1?arr[i]+n:arr[i])).toArray();
        
        int[] answer = arr.clone();
        
        for(int i=(arr.length+1)%2; i<arr.length; i+=2){
            answer[i] += n;
        }
        return answer;
        
    }
}
