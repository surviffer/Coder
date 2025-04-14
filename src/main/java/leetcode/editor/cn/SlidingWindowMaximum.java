package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.common.*;

public class SlidingWindowMaximum {
    public static void main(String[] args) {
        Solution solution = new SlidingWindowMaximum().new Solution();
        // put your test code here
        int[] nums = {1,3,1,2,0,5};
        int k = 3;
        int[] res=solution.maxSlidingWindow(nums, k);
        System.out.println(Arrays.toString(res));

    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {

    //采用PriorityQueue的问题是：maxHeap.remove(nums[left]);没有完全删除
    ////大顶堆
    //        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(k, Collections.reverseOrder());
    //        int left = 0;
    //        int right = left+k-1;
    //        int index = 0;
    //        for(int i = left;i<=right;i++){
    //            maxHeap.offer(nums[i]);
    //        }
    //        while(right < nums.length){
    //            result[index++]=maxHeap.peek();
    //            maxHeap.remove(nums[left]);
    //            maxHeap.remove(nums[right]);
    //            maxHeap.add(nums[++left]);
    //            maxHeap.add(nums[++right]);
    //        }
    //        return result;
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums==null || k<0) return new int[0];
        Deque<Integer> deque = new LinkedList<>();//存放下标的单调队列
        int index =0;
        int[] result = new int[nums.length-k+1];
        for(int i=0;i<nums.length;i++){
            //add
            while(!deque.isEmpty() && nums[deque.peekLast()]<nums[i]){
                deque.pollLast();
            }
            deque.addLast(i);
            //remove
            if (i- deque.getFirst()>=k){
                deque.removeFirst();
            }
            //record
            if(i>=k-1){
                result[index++]=nums[deque.peekFirst()];
            }
        }
        return result;

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}