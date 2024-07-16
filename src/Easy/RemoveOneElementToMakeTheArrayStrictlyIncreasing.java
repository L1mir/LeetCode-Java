package Easy;

import java.util.Arrays;

//Input: nums = [1,2,10,5,7]
//Output: true
//Input: nums = [2,3,1,2]
//Output: false
public class RemoveOneElementToMakeTheArrayStrictlyIncreasing {
    public static boolean canBeIncreasing(int[] nums) {
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i - 1]) {
                count++;
                if (i > 1 && nums[i] <= nums[i - 2]) nums[i] = nums[i - 1];
            }
        }
        return count <= 1;
    }
}
