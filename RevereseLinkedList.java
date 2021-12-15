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
//T.C = O(N)
//S.C = O(1)
class Solution {
    public ListNode reverseList(ListNode head) {
        
        if(head==null || head.next==null)
        {
            return head;
        }
        
        ListNode prev = null;
        ListNode curr = head;
        ListNode fast = head.next;
        while(fast!=null)
        {
            ListNode temp = curr;
            curr.next=prev;
            curr = fast;
            prev = temp;
            fast=fast.next;
        }
        curr.next = prev;
        return curr;
    }
}