class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int min = Math.min(sides[0], sides[1]);
        int max = Math.max(sides[0], sides[1]);
        
        answer += min - 1;// (min+max) - (max + 1);
        
        for(int i=1; i<=max; i++){
            if(min + i > max) answer += 1;
        }
        
        return answer;
    }
}
