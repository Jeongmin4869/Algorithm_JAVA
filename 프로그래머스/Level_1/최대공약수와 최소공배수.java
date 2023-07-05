class Solution {
    
    // 유클리드호제법
    public int gcd(int n, int m){
        if(n%m == 0) return m;
        return gcd(m, n%m);
    }
    
    public int[] solution(int n, int m) {
        int[] answer = {0,0};
        /*
        for(int i=Math.min(n,m); i>=1; i--){
            if(n%i == 0 && m%i == 0){
                answer[0] = i;
                answer[1] = n*m/i;
                break;
            }
        }*/
        answer[0] = gcd(n, m);
        answer[1] = m * n / answer[0];
        return answer;
    }
}
