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
    public void reorderList(ListNode head) {
        if(head==null||head.next==null)return ;
        //step 1--find middle
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        //step 2--reverse second half
        ListNode second=slow.next;
        slow.next=null;
        ListNode prev=null;
        while(second!=null){
            ListNode nextt=second.next;
            second.next=prev;
            prev=second;
            second=nextt;
        }
        //now prev==new head after reversing
        ListNode first=head;
        second=prev;
        //now merge alternatively
        while(second!=null){
            ListNode t1=first.next;
            ListNode t2=second.next;
            first.next=second;
            second.next=t1;
            first=t1;
            second=t2;
        }
    }
}