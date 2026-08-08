class Solution {
    public int jump(int[] nums) {
        int[] dp = new int[nums.length];
        
        for(int i=1; i<nums.length; i++){
            dp[i] = dp[i-1]+1;
            int back = i-nums[i];
            if(back>=0){
                dp[i] = Math.min(dp[i], dp[back]+1);
            }
        }
        return dp[nums.length-1];
    }
}
