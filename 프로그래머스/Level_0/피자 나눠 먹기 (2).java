class Solution {
    
    int gcd(int a, int b){
        if(a%b==0) return b;
        return gcd(b, a%b);
    }
    
    public int solution(int n) {
        int answer = n/gcd(Math.max(n, 6), Math.min(n, 6));
        return answer;
    }
    
}
