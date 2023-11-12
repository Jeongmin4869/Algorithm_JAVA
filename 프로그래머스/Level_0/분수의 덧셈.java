/*
class Solution {
    
    public int gcd(int a, int b){
        if(a%b == 0) return b;
        return gcd(b, a%b);
    }
    
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        
        int a = gcd(denom1, denom2); // 최대공약수
        int b = denom1*denom2/a ;// 최소공배수
        
        answer[0] = numer1*b/denom1 + numer2*b/denom2;
        answer[1] = b;
        
        a = gcd(answer[0], answer[1]);
        
        answer[0] /= a;
        answer[1] /= a;
        
        return answer;
    }
}
*/
class Solution {
    
    public int gcd(int a, int b){
        if(a%b == 0) return b;
        return gcd(b, a%b);
    }
    
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];

        answer[0] = numer1 * denom2 + numer2 * denom1;
        answer[1] = denom2 * denom1;
        
        int a = gcd(answer[0], answer[1]);
        
        answer[0] /= a;
        answer[1] /= a;
        
        return answer;
    }
}
