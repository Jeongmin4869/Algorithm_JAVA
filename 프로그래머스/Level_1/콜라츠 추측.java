class Solution {
    // num은 1 이상 8,000,000 미만인 정수
    public int solution(int num) {
        int answer = 0;
        long n = num;
        while(n != 1){
            answer += 1;
            if(n%2==0) n/=2;
            else if(n%2!=0) n = n*3+1;
            if(answer == 500) return -1;
        }

        return answer;
    }
}
