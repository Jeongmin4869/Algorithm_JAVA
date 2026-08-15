class Solution {
    static int M, N;    
    static int[][] dp ;
    public int uniquePaths(int m, int n) {
        M = m;
        N = n;
        dp = new int[M][N];
        
        for(int i=0; i<M; i++){
            dp[i][0] = 1;
        }

        for(int j=0; j<N; j++){
            dp[0][j] = 1;
        }

        for(int i=1; i<M; i++){
            for(int j=1; j<N; j++){
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }
        return dp[M-1][N-1];
    }
}
