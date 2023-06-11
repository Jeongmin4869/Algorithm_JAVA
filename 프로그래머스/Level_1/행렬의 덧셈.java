class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int row = arr1.length;
        int cell = arr1[0].length;
        int[][] answer = new int[row][cell];
        
        for(int i=0; i<row; i++){
            for(int j=0; j<cell; j++){
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return answer;
    }
}
