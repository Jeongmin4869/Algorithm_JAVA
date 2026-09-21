// O(N)
class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {        
        for(int i=0; i<k; i++){
            int minindex = 0;
            for(int j=0; j<nums.length; j++){
                if(nums[j] < nums[minindex]){
                    minindex = j;
                }
            }
            nums[minindex] *= -1;
        }

        int sum = 0;
        for(int num : nums){
            sum += num;
        }
        return sum;
    }
}

// O(N log N)
class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        for(int i=0; i<k; i++){
            nums[0] *= -1;
            Arrays.sort(nums);
        }

        int sum = 0;
        for(int num : nums){
            sum += num;
        }
        return sum;
    }
}
