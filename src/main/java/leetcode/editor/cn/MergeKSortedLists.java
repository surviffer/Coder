package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.common.*;

public class MergeKSortedLists {
    public static void main(String[] args) {
        Solution solution = new MergeKSortedLists().new Solution();
        // put your test code here 
    }
    //leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
    class Solution {
        public ListNode mergeKLists(ListNode[] lists) {
            if(lists==null || lists.length==0) return null;

            //小顶堆
            PriorityQueue<ListNode> pq = new PriorityQueue<>(lists.length, Comparator.comparingInt(a -> a.val));

            for(ListNode node:lists){
                if(node!=null){
                    pq.offer(node);
                }
            }

            ListNode dummy = new ListNode(-1);
            ListNode head = dummy;

            while (!pq.isEmpty()){
                ListNode minNode = pq.poll();
                head.next=minNode;
                head=head.next;

                if(minNode.next!=null){
                    pq.offer(minNode.next);
                }
            }
            return dummy.next;
        
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}