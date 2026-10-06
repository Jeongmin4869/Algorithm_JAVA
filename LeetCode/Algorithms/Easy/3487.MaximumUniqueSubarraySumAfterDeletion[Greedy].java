class Solution {
    public int maxSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            int now = nums[i];            
            if(now<=0) continue;
            if(i == 0 || now != nums[i-1]) sum += now;
        }
        return sum>0? sum : nums[nums.length-1];
    }
}
