class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int M = obstacleGrid.length;
        int N = obstacleGrid[0].length;
        int[][] dp = new int[M][N];
        for(int i=0; i<M; i++){
            if(obstacleGrid[i][0] == 1) break;
            dp[i][0] = 1;
        }

        for(int i=0; i<N; i++){
            if(obstacleGrid[0][i] == 1) break;
            dp[0][i] = 1;
        }

        for(int i=1; i<M; i++){
            for(int j=1; j<N; j++){
                if(obstacleGrid[i][j] == 1) continue;
                dp[i][j] += (dp[i-1][j] + dp[i][j-1]);
            }
        }
        return dp[M-1][N-1];
    }
}
