package Hard;

public class BinaryTreeMaximumPathSum {
    int ans = 0;

    int helper(TreeNode node){
        if (node == null) {
            return 0;
        }

        int maxLeftPath = Math.max(helper(node.left), 0);
        int maxRightPath = Math.max(helper(node.right), 0);

        ans = Math.max(ans, maxLeftPath + maxRightPath + node.val);

        return Math.max(maxLeftPath, maxRightPath) + node.val;
    }

    public int maxPathSum(TreeNode root) {
        ans = Integer.MIN_VALUE;
        helper(root);
        return ans;
    }
}
