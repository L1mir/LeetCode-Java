package Easy;
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class RangeSumOfBST {
    int sum = 0;
    public int rangeSumBST(TreeNode root, int low, int high) {
        rangeSumBSTUtil(root, low, high);
        return sum;
    }

    private void rangeSumBSTUtil(TreeNode root, int low, int high) {
        if(root.val >= low && root.val <= high) {
            sum += root.val;
        }

        if(root.val >= low && root.left != null) {
            rangeSumBST(root.left, low, high);
        }

        if(root.val <= high && root.right != null) {
            rangeSumBST(root.right, low, high);
        }
    }
}
