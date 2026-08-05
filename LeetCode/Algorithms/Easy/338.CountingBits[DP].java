class Solution {
    public int[] countBits(int n) {
        int[] dp = new int[n+1];
        if(n>=1) dp[1] = 1;
        if(n>=2) dp[2] = 1;
        for(int i=3; i<=n; i++){
            int num = i>>1;
            dp[i] += dp[num];
            if(i%2==1) dp[i] += 1;            
        }
        return dp;
    }
}
