package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.common.*;

public class RangeSumQueryImmutable {
    public static void main(String[] args) {
//        Solution solution = new RangeSumQueryImmutable().new Solution();
        // put your test code here
//        int[] arr = {-2, 0, 3, -5, 2, -1};
//        NumArray numArray = new NumArray(arr);
//        int res = numArray.sumRange(0, 2);
//        System.out.println(res);
        // return 1 ((-2) + 0 + 3) 
        // numArray.sumRange(2, 5); // return -1 (3 + (-5) + 2 + (-1)) numArray.sumRange(0, 5);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class NumArray {
    private int[] pre_sum;
    public NumArray(int[] nums) {
        pre_sum = new int[nums.length+1];
        pre_sum[0]=0;
        for(int i =1;i<=nums.length;i++){

            pre_sum[i]=pre_sum[i-1]+nums[i-1];
        }
    }
    
    public int sumRange(int left, int right) {
        return pre_sum[right+1]-pre_sum[left];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */
//leetcode submit region end(Prohibit modification and deletion)

}