class Solution {
    static int M, N;    
    static int[] dx = new int[]{0, 1};
    static int[] dy = new int[]{1, 0};
    static int[][] dp ;
    public int uniquePaths(int m, int n) {
        M = m;
        N = n;
        dp = new int[M][N];
        
        dfs(0,0);
        return dp[M-1][N-1];
    }

    public static void dfs(int x, int y){
        if(x == M-1 && y== N-1) return;
        for(int i=0; i<2; i++){
            int xx = x + dx[i];
            int yy = y + dy[i];
            if(xx>=0 && xx<M && yy>=0 && yy<N){
                dp[xx][yy] = dp[xx+1][yy] + dp[xx][yy+1];
            }
        }
    }
}
