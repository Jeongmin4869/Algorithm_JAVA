// 1. 에라토스테네스의 체 알고리즘
class Solution {
    
    public int solution(int n) {

        int answer = 0;
        int[] tmp = new int[n+1];
        for(int i=2; i<=n; i++){
            if(tmp[i] == 0){
                for(int j=2; j*i<=n; j++) tmp[i*j] = 1;
                answer += 1;
            }
        }
        return n-1-answer;
    }
}


// 2. Stream
import java.util.stream.*;
class Solution {
    
    public int solution(int n) {
        return (int)IntStream.rangeClosed(1, n)
                    .filter( i -> (IntStream.rangeClosed(1, i).filter(i2 -> i % i2 == 0).count() > 2))
                    .count();
    }
}

