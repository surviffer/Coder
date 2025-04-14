package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.common.*;

public class RotateArray {
    public static void main(String[] args) {
        Solution solution = new RotateArray().new Solution();
        // put your test code here
        int[] nums={1,2,3,4,5,6,7};
        solution.rotate(nums, 3);
        System.out.println(Arrays.toString(nums));
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public void rotate(int[] nums, int k) {
        int[] res = new int[nums.length];
        k=k%nums.length;
        for(int i=0;i<nums.length;i++){
            res[(i+k)%nums.length]=nums[i];
        }
        for (int i =0;i<nums.length;i++){
            nums[i]=res[i];
        }

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}