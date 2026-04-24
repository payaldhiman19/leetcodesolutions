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
    ListNode mergetwolists(ListNode head1,ListNode head2){
        if(head1==null && head2==null){
            return null;
        }
        if(head1==null) return head2;
        if(head2==null) return head1;
        if(head1.val<head2.val){
           head1.next= mergetwolists(head1.next,head2);
           return head1;

        }else{
            head2.next=mergetwolists(head1,head2.next);
            return head2;
        }
    }
    public ListNode sortList(ListNode head) {
        //we cna use the logic of merge two sorted linked divde and get middle and sort its leftand rught part
       if(head==null ||head.next==null){
        return head;
       }
       ListNode slow=head;
       ListNode fast=head;
       ListNode prev=null;
       while(fast!=null&&fast.next!=null){
        prev=slow;
        slow=slow.next;
        fast=fast.next.next;
       }
       prev.next=null;
       ListNode first=sortList(head);
       ListNode second=sortList(slow);
       return mergetwolists(first,second);
    }
}