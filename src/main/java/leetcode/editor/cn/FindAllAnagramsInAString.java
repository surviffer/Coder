package leetcode.editor.cn;

import java.sql.Array;
import java.util.*;
import leetcode.editor.common.*;

public class FindAllAnagramsInAString {
    public static void main(String[] args) {
        Solution solution = new FindAllAnagramsInAString().new Solution();
        // put your test code here
        String s = "acdcaeccde";
        String p = "c";
        List<Integer> result = solution.findAnagrams(s,p);
        System.out.println(result.toString());

    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<Integer> findAnagrams(String s, String p) {
            List<Integer> res = new ArrayList<>();
            int[] pCnt = new int[26];
            int[] sCnt = new int[26];
            for(char c: p.toCharArray()){
                pCnt[c-'a']++;
            }
            for(int right=0;right<s.length();right++){
                sCnt[s.charAt(right)-'a']++;
                int left = right-p.length()+1;
                if(left<0){
                    continue;
                }
                if (Arrays.equals(pCnt, sCnt)){
                    res.add(left);
                }
                sCnt[s.charAt(left)-'a']--;
            }
            return res;


        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}
//时间复杂度： O(nlogN)
//空间复杂度： O(n)

//public List<Integer> findAnagrams(String s, String p) {
//    ArrayList<Integer> result = new ArrayList<>();
//    char[] chars = p.toCharArray();
//    Arrays.sort(chars);
//    String target = new String(chars);
//    int targetLen = p.length();
//    int totalLen = s.length();
//    for (int i=0,j=i+targetLen-1;i<=j&&j<totalLen;i++,j++){
//        char[] newChar = new char[targetLen];
//        int index =0;
//        for (int k=i;k<=j;k++){
//            newChar[index++]=s.charAt(k);
//        }
//        Arrays.sort(newChar);
//        String newStr = new String(newChar);
//        if (newStr.equals(target)){
//            result.add(i);
//        }
//    }
//    return result;
//
//}