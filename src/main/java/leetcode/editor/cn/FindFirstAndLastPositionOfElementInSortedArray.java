package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.common.*;

public class FindFirstAndLastPositionOfElementInSortedArray {
    public static void main(String[] args) {
        Solution solution = new FindFirstAndLastPositionOfElementInSortedArray().new Solution();
        int[] nums = {};
        int[] res = solution.searchRange(nums, 0);
        System.out.printf("%d %d",res[0], res[1]);
        // put your test code here 
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
        public int[] searchRange(int[] nums, int target) {
            if (nums.length<1) return new int[]{-1, -1};
            int left = leftBound(nums,target);
            int right = rightBound(nums,target);
            if(left>=nums.length || right<0 || nums[left]!=target){
                return new int[]{-1, -1};
            }
            return new int[]{left, right};
        }

        public int leftBound(int[] nums, int target){
            int left = 0;
            int right = nums.length;
            while(left<right){
                int mid = left+(right-left)/2;
                if(nums[mid]>target){
                    right=mid;
                }else if(nums[mid]<target){
                    left=mid+1;
                }else if(nums[mid]==target){
                    right=mid;
                }
            }
            return left;
        }

        public int rightBound(int[] nums, int target){
            int left = 0;
            int right = nums.length;
            while(left<right){
                int mid = left+(right-left)/2;
                if(nums[mid]>target){
                    right=mid;
                }else if(nums[mid]<target){
                    left=mid+1;
                }else if(nums[mid]==target){
                    left=mid+1;
                }
            }
            return left-1;
        }
}
//leetcode submit region end(Prohibit modification and deletion)

}