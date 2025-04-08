package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.common.*;

public class MaximumNumberOfVowelsInASubstringOfGivenLength {
    public static void main(String[] args) {
        Solution solution = new MaximumNumberOfVowelsInASubstringOfGivenLength().new Solution();
        // put your test code here
        int res = solution.maxVowels("abciiidef",3);
        System.out.println(res);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int maxVowels(String s, int k){
            int n = s.length();
            int init = 0;
            for (int i=0;i<k;i++){
                if(isVowel(s.charAt(i))){
                    init++;
                }
            }
            int res = init;
            for (int left=1,right=k;right<n;left++,right++){
                if (isVowel(s.charAt(left-1))){
                    init--;
                }
                if(isVowel(s.charAt(right))){
                    init++;
                }
                res = Math.max(res,init);
            }
            return res;
        }
//        public int maxVowels(String s, int k) {
//            int[] vowelRes = new int[s.length()];
//            int index =0;
//            int n = s.length();
//            int init = 0;
//            for (Character c: s.toCharArray()){
//                if (isVowel(c)) {
//                    vowelRes[index] = 1;
//                }
//                if (index<k){
//                    init+=vowelRes[index];
//                }
//                index++;
//            }
//            int res = init;
//            for(int left =1, right = left+k-1;left<s.length()-k-1;left++,right++){
//                init=init-vowelRes[left-1]+vowelRes[right];
//                res=Math.max(res,init);
//
//            }
//            return res;
//        }

        boolean isVowel(Character c){
            return "aeiou".indexOf(c) != -1;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}