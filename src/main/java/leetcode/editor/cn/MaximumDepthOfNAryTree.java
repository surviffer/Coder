package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.common.*;

public class MaximumDepthOfNAryTree {
    public static void main(String[] args) {
        Solution solution = new MaximumDepthOfNAryTree().new Solution();
        // put your test code here

    }
    //leetcode submit region begin(Prohibit modification and deletion)
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {

    //dfs
    public int maxDepth(Node root) {
        if (root==null){
            return 0;
        }
        int ans = 0;
        for (Node child : root.children){
            ans = Math.max(ans, maxDepth(child));
        }
        return ans+1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}