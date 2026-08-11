class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int N = cost.length;
        int[] dp = new int[N];
        if(N>=1) dp[0] = cost[0];
        if(N>=2) dp[1] = cost[1];
        for(int i=2; i<N; i++){
            dp[i] = Math.min(dp[i-2],dp[i-1]) + cost[i];
        }
        return N>=2?Math.min(dp[N-1], dp[N-2]):dp[N-1];
    }
}