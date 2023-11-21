class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = arr.clone();
        for(int i=0; i<queries.length; i++){
            int s = queries[i][0], e = queries[i][1];
            for(int j = s; j<=e; j++){
                answer[j] += 1;
            }
        }
        return answer;
    }
}
