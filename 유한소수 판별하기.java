class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int num = 1;
        for(int i=3; i<=b; i++){
            if(b==1) break;
            if(b%i==0 && i%2!=0 && i%5!=0){
                num *= i;
                b /= i;
                i--;
            }
        }
        
        if(a%num == 0) return 1;
        
        return 2;
    }
}
