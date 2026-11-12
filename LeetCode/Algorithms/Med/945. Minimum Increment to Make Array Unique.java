import java.util.Arrays;

class Solution {
    public int minIncrementForUnique(int[] nums) {
        int result = 0;
        Arrays.sort(nums);

        int now = 0;

        for (int num : nums) {
            if (now >= num) {
                int dis = now + 1 - num;
                result += dis;
                now += dis;
            } else {
                now = num;
            }
        }

        return result;
    }
}
