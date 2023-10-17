class Solution {
    public int solution(int[][] lines) {
        int[] arr = new int[201];
        int answer = 0;
        int min = 200, max = 0;
        for(int i=0; i<lines.length; i++){
            for(int j=lines[i][0]; j<lines[i][1]; j++){
                arr[(j+2+j)/2+100] += 1; // 두 간선의 중간값
            }
        }
        
        for(int i=0; i<201; i++){
            if(arr[i] > 1) answer += 1;
        }
        
        return answer;
    }
}
