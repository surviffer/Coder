package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.common.*;

public class SymmetricTree {
    public static void main(String[] args) {
        Solution solution = new SymmetricTree().new Solution();
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
        public boolean isSymmetric(TreeNode root) {
            if (root==null) return false;
            return isSame(root.left, root.right);
        }

        public boolean isSame(TreeNode node1, TreeNode node2){
            if (node1==null && node2==null){
                return true;
            }else if(node1==null || node2==null){
                return false;
            }else if (node1.val!= node2.val){
                return false;
            }else{
                return isSame(node1.left, node2.right)&&isSame(node1.right, node2.left);
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}