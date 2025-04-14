package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.common.*;

public class MinimumWindowSubstring {
    public static void main(String[] args) {
        Solution solution = new MinimumWindowSubstring().new Solution();
        // put your test code here 
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {


        public String minWindow(String s, String t) {
            //1. target map
            HashMap<Character,Integer> target = new HashMap<>();
            for (Character c:t.toCharArray()){
                target.put(c,target.getOrDefault(c,0)+1);
            }

            //2. 滑动窗口
            HashMap<Character,Integer> window = new HashMap<>();
            //3.滑动窗口的位置
            int left=0,right=0;
            //4.有效的个数，起始位置
            int valid=0,start=0;
            int min_len=Integer.MAX_VALUE;
            while (right<s.length()){
                char c = s.charAt(right);
//                right++: 扩展窗口
                right++;
                //add
                if (target.containsKey(c)){
                    window.put(c, window.getOrDefault(c, 0)+1);
                    if (window.get(c).intValue()==target.get(c).intValue()){
                        valid++;
                    }
                }

                while (valid==target.size()){
                    //更新最小长度
                    if (left-right<min_len){
                        start=left;
                        min_len=right-left;
                    }
                    char d = s.charAt(left);
                    left++;
                    if (target.containsKey(d)){
                        window.put(d, window.getOrDefault(d,0)-1);
                        if (window.get(d).intValue()==target.get(d).intValue()){
                            valid--;
                        }
                    }
                }

            }
            return min_len==Integer.MAX_VALUE?"":s.substring(start, start+min_len);
        }















//    public String minWindow(String s, String t) {
//        //step1 ：统计t中每个字符需要的数量
//        HashMap<Character,Integer> need = new HashMap<>();
//        for(Character c:t.toCharArray()){
//            need.put(c, need.getOrDefault(c, 0)+1);
//        }
//        //  step2：滑动窗口左右指针以及，窗口字符频次
//        HashMap<Character,Integer> window = new HashMap<>();
//        int left = 0;
//        int right = 0;
//        //step3:记录有多少字符已经满足need的频次
//        int valid = 0;
//        //step4:记录最小子串的起始位置，和长度
//        int start = 0, min_len = Integer.MAX_VALUE;
//        //step5:开始滑动窗口
//        while(right<s.length()){
//            char c = s.charAt(right);
//            right++;//拓展窗口
//            //只处理需要的字符
//            if (need.containsKey(c)){
//                window.put(c, window.getOrDefault(c,0 )+1);
//                if (window.get(c).intValue()==need.get(c).intValue()){
//                    valid++;
//                }
//            }
//            //当窗口满足条件时，开始尝试收缩
//            while (valid == need.size()){
//                //更新最小子串记录
//                if (min_len>right-left){
//                    start=left;
//                    min_len=right-left;
//                }
//                char d = s.charAt(left);
//                left++;//收缩窗口
//                //只处理需要的字符
//                if (need.containsKey(d)){
//                    if (window.get(d).equals(need.get(d))){
//                        valid--;
//                    }
//                    window.put(d, window.getOrDefault(d, 0)-1);
//                }
//            }
//
//        }
//        return min_len==Integer.MAX_VALUE?"":s.substring(start,start+min_len);
//
//    }
}
//leetcode submit region end(Prohibit modification and deletion)

}



class Solution {
    public String minWindow(String s, String t) {
        //1. target map
        HashMap<Character,Integer> target = new HashMap<>();
        for (Character c:t.toCharArray()){
            target.put(c,target.getOrDefault(c,0)+1);
        }

        //2. 滑动窗口
        HashMap<Character,Integer> window = new HashMap<>();
        //3.滑动窗口的位置
        int left=0,right=0;
        //4.有效的个数，起始位置
        int valid=0,start=0;
        int min_len=Integer.MAX_VALUE;
        while (right<s.length()){
            char c = s.charAt(right);
            right++;
            //add
            if (target.containsKey(c)){
                window.put(c, window.getOrDefault(c, 0)+1);
                if (window.get(c).intValue()==target.get(c).intValue()){
                    valid++;
                }
            }

            while (valid==target.size()){
                //更新最小长度
                if (right-left<min_len){
                    start=left;
                    min_len=right-left;
                }
                char d = s.charAt(left);
                left++;
                if (target.containsKey(d)){
                    if (window.get(d).intValue()==target.get(d).intValue()){
                        valid--;
                    }
                    window.put(d, window.get(d)-1);
                }
            }
        }
        return min_len==Integer.MAX_VALUE?"":s.substring(start, start+min_len);
    }
}