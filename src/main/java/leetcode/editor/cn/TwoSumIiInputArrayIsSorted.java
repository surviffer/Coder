package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.common.*;

public class TwoSumIiInputArrayIsSorted {
    public static void main(String[] args) {
        Solution solution = new TwoSumIiInputArrayIsSorted().new Solution();
        // put your test code here 
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        int left=0;
        int right=numbers.length-1;
        while (left<right){
            int sum = numbers[left]+numbers[right];
            if (sum==target){
                res[0]=left+1;
                res[1]=right+1;
                return res;
            } else if (sum<target) {
                left++;
            } else{
                right--;
            }
        }

        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}