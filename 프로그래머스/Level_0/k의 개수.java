class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for(int num = i; num <= j; num++){
            int n = num;
            while(n>0){
                if (n%10 == k) answer += 1;
                n/=10;
            }
        }
        return answer;
    }
}
