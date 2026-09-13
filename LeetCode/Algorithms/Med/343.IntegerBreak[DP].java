class Solution {
    public int integerBreak(int n) {
        int[] dp = new int[n+1];
        dp[2] = 1;
        for(int i=2; i<=n; i++){
            for(int j=1; j<i; j++){
                int leftmax = 0;
                int rightmax = 0;
                // left를 j그대로 쓸지 j가 쪼개진 값중 최댓값을 쓸지
                leftmax = Math.max(j, dp[j]);
                // right를 i-j그대로 쓸지, i-j가 쪼개진 값중 최댓값을 쓸지
                rightmax = Math.max(i-j, dp[i-j]);
                dp[i] = Math.max(dp[i], leftmax * rightmax);                
            }
        }
        return dp[n];
    }
}
