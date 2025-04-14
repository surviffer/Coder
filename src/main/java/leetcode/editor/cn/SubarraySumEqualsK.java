package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.common.*;

public class SubarraySumEqualsK {
    public static void main(String[] args) {
        Solution solution = new SubarraySumEqualsK().new Solution();
        // put your test code here
        int[] nums={1,1,1};
        solution.subarraySum(nums, 2);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int subarraySum(int[] nums, int k){
            int count = 0;
            int sum = 0;
            HashMap<Integer,Integer> hashMap = new HashMap<>();
            hashMap.put(0, 1);//sum=0的有一个
            for (int num:nums){
                sum+=num;
                if (hashMap.containsKey(sum-k)){
                    count+=hashMap.get(sum-k);
                }
                hashMap.put(sum, hashMap.getOrDefault(sum, 0)+1);

            }
            return count;

        }
//        public int subarraySum(int[] nums, int k) {
//
//            //暴力破解：时间复杂度是n的平方
//            int res = 0;
//            int len = nums.length;
//            for (int i=0;i<len;i++){
//                int sum =0;
//                for (int j=i;j<len;j++){
//                    sum+=nums[j];
//                    if (sum==k){
//                        res++;
//                    }
//                }
//            }
//
//            return res;
//
//        }
    }

//leetcode submit region end(Prohibit modification and deletion)

}