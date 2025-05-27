package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.common.*;

public class MaximumDepthOfBinaryTree {
    public static void main(String[] args) {
        Solution solution = new MaximumDepthOfBinaryTree().new Solution();
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

    //递归写法
    public int maxDepth1(TreeNode root) {
        if(root==null){
            return 0;
        }
        //
        int leftMax= maxDepth1(root.left);
        int rightMax= maxDepth1(root.right);
        return Math.max(leftMax, rightMax);
        
    }

    // 方法二：dfs
    // 记录最大深度：返回值
    int maxDepth = 0;
    // 记录遍历到的节点深度
    int depth =0;

    public int maxDepth(TreeNode root) {
        traverse(root);
        return maxDepth;
    }

    public void traverse(TreeNode root){
        if (root==null){
            return;
        }
        //前序
        depth++;
        if (root.left==null && root.right==null){
            //到达叶子节点，更新最大深度
            maxDepth=Math.max(depth, maxDepth);
        }
        traverse(root.left);
        traverse(root.right);
        //后序
        /* 前序位置是进入一个节点的时候，后序是离开一个节点的时候，所以要这么维护这个节点 */
        depth--;

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}