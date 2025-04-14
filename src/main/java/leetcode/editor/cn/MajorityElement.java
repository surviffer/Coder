package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.common.*;

public class MajorityElement {
    public static void main(String[] args) {
        Solution solution = new MajorityElement().new Solution();
        // put your test code here 
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int majorityElement(int[] nums) {
            Map<Integer,Long> map = new HashMap<>();
            long len = nums.length;
            for(int num:nums){
                map.put(num, map.getOrDefault(num, 0L)+1);
                if (map.get(num)>len/2){
                    return num;
                }
            }
            return 0;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}