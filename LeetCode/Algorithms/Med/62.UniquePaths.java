class Solution {
    static int M, N;    
    static int[][] dp ;
    public int uniquePaths(int m, int n) {
        M = m;
        N = n;
        dp = new int[M][N];
        int answer = dfs(0,0);
        return answer;
    }

    public static int dfs(int x, int y){
        if(x >= M || y>= N) return 0;
        if(x == M-1 && y == N-1) return 1;
        dp[x][y] =dfs(x+1,y) + dfs(x,y+1);
        return dp[x][y];
    }
}
