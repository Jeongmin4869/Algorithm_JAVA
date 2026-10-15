class Solution {
    public int maxProfit(int[] prices, int fee) {
        int N = prices.length;
        // dp[i][0]: i일이 끝났을 때 주식을 보유하지 않은 최대 이익
        // dp[i][1]: i일이 끝났을 때 주식을 보유한 최대 이익
        int[][] dp = new int[N+1][2];
        dp[0][1] = -5 * 10000; // 초기값셋팅
        for(int i=1; i<=N; i++){
            int price = prices[i-1];
            dp[i][0] = Math.max(dp[i-1][0], dp[i-1][1]+price-fee);
            dp[i][1] = Math.max(dp[i-1][0] - price, dp[i-1][1]);
        }

        return dp[N][0];
    }
}
