class Solution {
    public int lengthOfLIS(int[] nums) {
        int N = nums.length;
        int[] dp = new int[N];
        Arrays.fill(dp, 1);
        for(int i=0; i<N; i++){
            for(int j=0; j<i; j++){
                if(nums[j]<nums[i]){
                    // i번째 숫자에서 끝나는 LIS의 최대 길이
                    dp[i] = Math.max(dp[i], dp[j]+1);
                }
            }
        }
        int max = 0;
        for(int now : dp){
            max = Math.max(now, max);
        }

        return max;
    }
}
