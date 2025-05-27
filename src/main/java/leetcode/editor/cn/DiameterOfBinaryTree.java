package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.common.*;

public class DiameterOfBinaryTree {
    public static void main(String[] args) {
        Solution solution = new DiameterOfBinaryTree().new Solution();
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

    private int maxD = 0;

    /**
     * 最大直径=left 最大+ right最大
     *
     * @param root
     * @return
     */
    public int diameterOfBinaryTree(TreeNode root) {
        traverse(root);
        return maxD;
    }

    public int traverse(TreeNode node){
        if (node==null){
            return 0;
        }
        int leftD = traverse(node.left);
        int rightD = traverse(node.right);
        int currD = leftD+rightD;
        maxD = Math.max(maxD, currD);
        return 1+Math.max(leftD,rightD);
    }


}
//leetcode submit region end(Prohibit modification and deletion)

}