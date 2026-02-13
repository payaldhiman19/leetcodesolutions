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
        if(head==null ||head.next==null)return;
        //STEP 1: find middle
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null &&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        //STEP 2: reverse second half
        ListNode second=slow.next;  //middle elemnt
        slow.next=null;
        ListNode prev=null;
        while(second!=null){
            ListNode nextt=second.next;
            second.next=prev;
            prev=second;
            second=nextt;
        }
        //Step 3: prev==head of reversed list
        ListNode first=head;
        second=prev;           //prev is now head stored in second
        //step 3:merge alternatively
        while(second!=null){
            ListNode temp1=first.next;
            ListNode temp2=second.next;
            first.next=second;
            second.next=temp1;
            first=temp1;
            second=temp2;
        }
        
    }
}