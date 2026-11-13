import java.util.Arrays;

class Solution {
    public int minIncrementForUnique(int[] nums) {
        int result = 0;
        Arrays.sort(nums);

        int pre = -1;

        for (int num : nums) {
            if (pre >= num) {
                int dis = pre + 1 - num;
                result += dis;
                pre ++;
            } else {
                pre = num;
            }
        }

        return result;
    }
}
