package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.common.*;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        Solution solution = new ContainerWithMostWater().new Solution();
        // put your test code here 
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        if (height.length<=1) return maxArea;
        int left=0,right=height.length-1;
        while(left < right){
            int area = Math.min(height[right],height[left])*(right-left);
            maxArea = Math.max(area, maxArea);
            if (height[left]<=height[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxArea;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}