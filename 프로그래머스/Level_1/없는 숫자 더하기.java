import java.util.Arrays; // sort

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int[] num = {0,1,2,3,4,5,6,7,8,9};
        Arrays.sort(numbers);
        for(int i=0; i<num.length; i++){
            if(Arrays.binarySearch(numbers, num[i])<0)
                answer +=  num[i];
        }

        return answer;
    }
}
