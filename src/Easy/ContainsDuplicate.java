package Easy;

import java.util.Arrays;

//Input: nums = [1,2,3,1]
//Output: true
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1 ; i++) {
            if (nums[i + 1] == nums[i]) return true;
        }

        return false;
    }
}
