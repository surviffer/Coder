package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.common.*;

public class FindTheDuplicateNumber {
    public static void main(String[] args) {
        Solution solution = new FindTheDuplicateNumber().new Solution();
        // put your test code here
        int[] nums={1,3,4,2,2};
        solution.findDuplicate(nums);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findDuplicate(int[] nums) {
        BitSet bitSet = new BitSet();
        for (int num : nums){
            if (bitSet.get(num)){
                return num;
            }
            bitSet.set(num);
        }
        return 0;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}