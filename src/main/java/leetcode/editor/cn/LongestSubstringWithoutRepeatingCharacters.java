package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.common.*;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        Solution solution = new LongestSubstringWithoutRepeatingCharacters().new Solution();
        // put your test code here 
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int lengthOfLongestSubstring(String s) {
//            k： character v: index
            if (s.isEmpty()) return 0;
            HashMap<Character, Integer> window = new HashMap<>();
            int left = 0;
            int max = 0;
            for (int i=0;i<s.length();i++){
                if (window.containsKey(s.charAt(i))){
                    left= Math.max(left,window.get(s.charAt(i))+1);
                }
                window.put(s.charAt(i),i);
                max=Math.max(max,i-left+1);


            }
            return max;


        
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}