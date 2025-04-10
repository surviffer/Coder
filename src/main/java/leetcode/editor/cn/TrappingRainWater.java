package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.common.*;

public class TrappingRainWater {
    public static void main(String[] args) {
        Solution solution = new TrappingRainWater().new Solution();
        // put your test code here 
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int trap(int[] height) {
        int[] pre_max = new int[height.length];
        int[] suf_max = new int[height.length];
        pre_max[0]=height[0];
        suf_max[height.length-1]=height[height.length-1];
        for (int i =1;i<height.length;i++){
            pre_max[i]=Math.max(pre_max[i-1],height[i]);
        }
        for (int i=height.length-2;i>=0;i--){
            suf_max[i]=Math.max(suf_max[i+1],height[i]);
        }
        int area=0;
        for (int i=0;i<height.length;i++){
            area+=Math.max(Math.min(suf_max[i],pre_max[i])-height[i],0);
        }

        return area;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}