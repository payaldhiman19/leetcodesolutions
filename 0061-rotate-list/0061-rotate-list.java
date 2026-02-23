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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null ||head.next==null||k==0){
            return head;
        }
        //first find the length to find where to cut the list
        int length=1;
        ListNode temp=head;
        while(temp.next!=null){
            temp=temp.next;
            length++;
        }
         k=k%length;
    if(k==0)return head;
        temp.next=head;   //make it circualr
       
       int n=length-k;
       ListNode newtail=head;
       for(int i=1;i<n;i++){
        newtail=newtail.next;
       }
       ListNode newhead=newtail.next;
       newtail.next=null;
        return newhead;
    }
}