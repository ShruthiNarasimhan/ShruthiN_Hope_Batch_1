import java.util.Arrays;

class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);

        int count = 1;
        int maxCount = 1;
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] == nums[i - 1]) {
                count++;
            } else {
                count = 1;
            }

            if (count > maxCount) {
                maxCount = count;
                result = nums[i];
            }
        }

        return result;
    }
}