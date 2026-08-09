class Solution {
    public int jump(int[] nums) {
        int[] dp = new int[nums.length];
        
        for(int i=1; i<nums.length; i++){
            dp[i] = i;
            for(int j=0; j<i; j++){
                if(nums[j] + j >= i){
                    dp[i] = Math.min(dp[i], dp[j]+1);
                }
            }
        }
        return dp[nums.length-1];
    }
}
