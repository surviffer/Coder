package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.common.*;

public class ValidateBinarySearchTree {
    public static void main(String[] args) {
        Solution solution = new ValidateBinarySearchTree().new Solution();
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
    public boolean isValidBST(TreeNode root) {
        return valid(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }


    public boolean valid(TreeNode root, long min, long max){
        if (root==null){
            return true;
        }
        if (root.val<=min || root.val>=max){
            return false;
        }
        return valid(root.left, min, root.val) && valid(root.right, root.val, max);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}