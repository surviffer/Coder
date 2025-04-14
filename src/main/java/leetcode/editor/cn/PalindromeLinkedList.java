package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.common.*;

public class PalindromeLinkedList {
    public static void main(String[] args) {
        Solution solution = new PalindromeLinkedList().new Solution();
        int[] nums={1,1,2,1};
        ListNode head = ListNode.createHead(nums);
        // put your test code here
        System.out.println(solution.isPalindrome(head));
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
    public boolean isPalindrome(ListNode head) {
        if (head==null ||head.next==null) return true;
        ListNode fast=head,slow=head;
        while (fast!=null&& fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        ListNode secondHalf = reverse(slow);
        ListNode firstHalf = head;

        while(secondHalf!=null){
            if (secondHalf.val!=firstHalf.val){
                return false;
            }
            firstHalf=firstHalf.next;
            secondHalf=secondHalf.next;
        }
        return true;
    }

    public ListNode reverse(ListNode head){
        ListNode pre=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode tmp = curr.next;
            curr.next=pre;
            pre=curr;
            curr=tmp;
        }
        return pre;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}