package Medium;

import java.util.ArrayList;
import java.util.List;


//Input: nums = [1,2,3]
//Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
//Input: nums = [0,1]
//Output: [[0,1],[1,0]]
//Input: nums = [1]
//Output: [[1]]
public class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums.length == 1) {
            List<Integer> singleList = new ArrayList<>();
            singleList.add(nums[0]);
            res.add(singleList);
            return res;
        }

        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            int[] remainingNums = new int[nums.length - 1];
            int index = 0;
            for (int j = 0; j < nums.length; j++) {
                if (j != i) {
                    remainingNums[index] = nums[j];
                    index++;
                }
            }

            List<List<Integer>> perms = permute(remainingNums);
            for (List<Integer> p : perms) {
                p.add(n);
            }

            res.addAll(perms);
        }

        return res;
    }
}
