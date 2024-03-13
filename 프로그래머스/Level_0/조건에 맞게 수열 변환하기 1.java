import java.util.stream.*;

class Solution {
    public int[] solution(int[] arr) {
        //return IntStream.of(arr).map(i -> i<50&&i%2==1?i*2:i>=50&&i%2==0?i/2:i).toArray();
        for(int i=0; i<arr.length; i++){
            int num = arr[i];
            if(num>=50 && num%2==0){
                num/=2;
            }
            else if (num<50 && num%2==1){
                num*=2;
            }
            arr[i] = num;
        }
        return arr;
    }
}
