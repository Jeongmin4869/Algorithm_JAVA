class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        int sum = 0;
        for(int num : nums) sum += num;

        int cur = 0;
        for(int i = nums.length-1; i>=0; i--){
            int num = nums[i];
            cur += num;
            sum -= num;
            list.add(num);
            if(cur > sum) break;
        }

        return list;
    }
}