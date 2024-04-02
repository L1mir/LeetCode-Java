package Easy;

public class RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int result = 1;
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] != nums[result - 1]) {
                nums[result] = nums[i];
                result++;
            }
        }
        return result;
    }
}
