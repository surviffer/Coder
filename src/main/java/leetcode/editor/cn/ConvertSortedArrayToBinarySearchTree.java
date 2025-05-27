package leetcode.editor.cn;

import java.util.*;

import com.sun.source.tree.Tree;
import leetcode.editor.common.*;

public class ConvertSortedArrayToBinarySearchTree {
    public static void main(String[] args) {
        Solution solution = new ConvertSortedArrayToBinarySearchTree().new Solution();
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
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length<=0) return null;
        return dfs(nums, 0, nums.length-1);
    }

    public TreeNode dfs(int[] nums, int left, int right){
        if (left>right) return null;
        int middle = left+(right-left)/2;
        TreeNode root = new TreeNode(nums[middle]);
        root.left = dfs(nums, left, middle-1);
        root.right = dfs(nums, middle+1, right);
        return root;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}