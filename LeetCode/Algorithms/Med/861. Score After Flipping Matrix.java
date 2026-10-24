class Solution {
    public int matrixScore(int[][] grid) {
        int score = 0;
        int N = grid.length;
        int M = grid[0].length;
        for(int i=0; i<N; i++){
            if(grid[i][0] == 0){
                for(int j=0; j<M; j++){
                    grid[i][j] = (grid[i][j]+1)%2;
                }
            }
        }
               
    }
}