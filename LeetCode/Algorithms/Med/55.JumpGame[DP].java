class Solution {
    public boolean canJump(int[] nums) {
        int N = nums.length;
        boolean[] dp = new boolean[N];
        dp[0] = true;
        
        for(int i=1; i<N; i++){       
            for(int j=0; j<i; j++){                
                if(dp[j] && j + nums[j] >= i){
                    dp[i] = true;
                }
            }
        }
        return dp[N-1];
    }
}
