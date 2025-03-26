package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.common.*;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        Solution solution = new LongestConsecutiveSequence().new Solution();
        // put your test code here
        solution.longestConsecutive(new int[]{});
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
//        public int longestConsecutive(int[] nums) {
//            int ans = 0;
//            Set<Integer> st = new HashSet<>();
//            for (int num : nums) {
//                st.add(num); // 把 nums 转成哈希集合
//            }
//            for (int x : st) { // 遍历哈希集合
//                if (st.contains(x - 1)) {
//                    continue;
//                }
//                // x 是序列的起点
//                int y = x + 1;
//                while (st.contains(y)) { // 不断查找下一个数是否在哈希集合中
//                    y++;
//                }
//                // 循环结束后，y-1 是最后一个在哈希集合中的数
//                ans = Math.max(ans, y - x); // 从 x 到 y-1 一共 y-x 个数
//            }
//            return ans;
//        }
//    }
////            if (nums.length == 0) return 0;
        public int longestConsecutive(int[] nums) {
            Set<Integer> set = new HashSet<>();
            for (int num : nums) {
                set.add(num);
            }
            int len = 0;
            for (int num: set) {
                if (!set.contains(num - 1)) {
                    int seqLen = 1;
                    int tmp = num;
                    while (set.contains(tmp + 1)) {
                        seqLen++;
                        tmp++;
                    }
                    len = Math.max(len, seqLen);
                }
            }
            return len;

        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}