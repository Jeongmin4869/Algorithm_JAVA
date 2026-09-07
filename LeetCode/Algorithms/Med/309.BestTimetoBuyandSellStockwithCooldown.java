class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[][] dp = new int[n][2];
        dp[0][0] = prices[0];
        for(int i=0; i<n; i++){
            int price = prices[i];
            dp[i][0] = Math.max(dp[i-1][0], dp[i-1][2])-price; 
            dp[i][1] =dp[i-1][0] + price;
            dp[i][2] = Math.max(dp[i-1][0], dp[i-1][1]);
        }

        return Math.max(dp[n-1][0], Math.max(dp[i-1][1], dp[i-1][2]));
    }
}