class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        for(int num : num_list){
            int count = 0;
            while(num > 1){
                if(num%2!=0) num -=1;
                num /=2;
                count += 1;
            }
            answer += count;
        }
        return answer;
    }
}
