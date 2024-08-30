package Easy;

import java.util.*;

//Input: nums = [2,2,1,1,1,2,2]
//Output: 2
public class MajorityElement {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return nums[n/2];
    }
}
