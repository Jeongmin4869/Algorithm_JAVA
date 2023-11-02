class Solution {
    
    int fac(int i, int n, int now){
        int sum = now * i;
        if(sum > n) return i-1;
        if(sum == n) return i;
        return fac(i+1, n, sum);
    }
    
    public int solution(int n) {
        int answer = fac(1, n, 1);
        return answer;
    }
}
