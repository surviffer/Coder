package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.common.*;

public class SearchInsertPosition {
    public static void main(String[] args) {
        Solution solution = new SearchInsertPosition().new Solution();
        // put your test code here 
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        while(left<right){
            int mid = left+(right-left)/2;
            if (nums[mid]>target){
                right = mid;
            } else if (nums[mid]<target) {
                left = mid+1;
            } else if (nums[mid]==target) {
                right = mid;
            }
        }
        return left;

    }

    public int middle_search_left(int[] nums, int target){
        int left = 0;
        int right = nums.length;
        while(left<right){
            int mid = left+(right-left)/2;
            if (nums[mid]>target){
                right = mid;
            } else if (nums[mid]<target) {
                left = mid+1;
            } else if (nums[mid]==target) {
                right = mid;
            }
        }
        return left;
    }

    public int midSearch(int[] nums, int target){
        int low = 0;
        int high = nums.length-1;
        int middle = low+(high-low)/2;
        while(low<=high) {
            if (nums[middle] == target) {
                return middle;
            } else if (nums[middle] > target) {
               low = middle+1;
            } else {
               high=middle-1;
            }
        }
        return -1;
    }



    public void quickSort(int[] nums){
        quickSortCore(nums, 0, nums.length-1);
    }

    public void quickSortCore(int[] nums, int left, int right){
        if (left>=right) return;
        int pivotIdx = partition(nums, left, right);
        quickSortCore(nums, left, pivotIdx-1);
        quickSortCore(nums, pivotIdx+1, right);

    }
    public int partition(int[] nums, int low, int high){
        int pivot = nums[high];
        int index = low-1;
        for (int j=low;j<=high;j++){
            if (nums[j]<pivot){
                index++;
                swap(nums, index, j);
            }
        }
        swap(nums, index+1, high);
        return index+1;
    }
    public void swap(int[] nums, int i, int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }


}
//leetcode submit region end(Prohibit modification and deletion)

}