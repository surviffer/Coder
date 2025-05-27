package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.common.*;

public class BinaryTreeMaximumPathSum {
    public static void main(String[] args) {
        Solution solution = new BinaryTreeMaximumPathSum().new Solution();
        // put your test code here 
    }
    //leetcode submit region begin(Prohibit modification and deletion)
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
class Solution {

    private int maxSum = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        dfs(root);
        return maxSum;
    }

    public int dfs(TreeNode root){
        if (root==null){
            return 0;
        }
        int left = dfs(root.left);
        int right = dfs(root.right);
        int val = root.val;
        if (left>=0) val+=left;
        if (right>=0) val+=right;
        maxSum = Math.max(maxSum, val);
        return Math.max(root.val, Math.max(left, right)+root.val);

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}