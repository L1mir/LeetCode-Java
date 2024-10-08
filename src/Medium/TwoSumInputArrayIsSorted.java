package Medium;

public class TwoSumInputArrayIsSorted {
    public int[] twoSum(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (nums[left] + nums[right] != target) {
            if (nums[left] + nums[right] > target) {
                right++;
            }
            else {
                left--;
            }
        }
        return new int[] {left + 1, right + 1};
    }
}
