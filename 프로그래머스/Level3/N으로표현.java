import java.util.*;

class Solution {
    public int solution(int N, int number) {
        Set<Integer>[] dp = new HashSet[9];
        int answer = 0;
        for(int i=1; i<=8; i++){
            dp[i] = new HashSet<>();
            int num = 0;
            for(int j=0; j<i; j++){
                num = num*10 + N;
            }            
            dp[i].add(num);
                    
            for(int a:dp[i]){
                for(int b:dp[j-i]){
                    dp[i].add(a+b);
                    dp[i].add(a-b);
                    dp[i].add(a/b);
                    dp[i].add(a*b);
                }
            }
            if(dp[i].contains(number)) return i;
        }
        
        return -1;
    }
}