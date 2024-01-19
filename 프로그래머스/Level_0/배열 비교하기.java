import java.util.stream.*;
class Solution {
    public int solution(int[] arr1, int[] arr2) {
        /*
        int size1 = arr1.length;
        int size2 = arr2.length;
        int sum1 = IntStream.range(0, size1).map(i -> arr1[i]).sum();
        int sum2 = IntStream.range(0, size2).map(i -> arr2[i]).sum();
        
        if(size1<size2) return -1;
        else if (size1 > size2) return 1;
        else {
            if(sum1 == sum2) return 0;
            if(sum1 > sum2) return 1;
            if(sum1 < sum2) return -1;
        }
        return 0;
        */
        
        int answer = Integer.compare(arr1.length, arr2.length);
        
        if(answer == 0) 
            answer = Integer.compare(IntStream.of(arr1).sum(), IntStream.of(arr2).sum());
        
        return answer;
    }
}
