class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=1; i<=n; i++){
            answer += ((n*i)%2*i) + ((n+1)*(i+1)%2*i*i);
        }
        return answer;
    }
}
