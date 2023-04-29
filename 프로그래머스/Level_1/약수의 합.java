class Solution {
    public int solution(int n) {
        int answer = 0;
        int min = n;
        
        if(n==1) return 1;
        
        for(int i=1; i<=n/2; i++){
            if(i==min) break;
            if(n%i==0){
                min = n/i;
                if(min == i){
                    answer += min;
                    break;
                }
                answer += min + i;
            }
        }
        return answer;
    }
}
