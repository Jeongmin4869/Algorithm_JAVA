class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        int[] counts = new int[31];
        for(int i=0; i<strArr.length; i++){
            counts[strArr[i].length()] += 1;
        }
        
        for(int i=1; i<=30; i++){
            answer = Math.max(answer, counts[i]);
        }
        
        return answer;
    }
}
