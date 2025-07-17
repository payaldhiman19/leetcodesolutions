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
    public ListNode reverseKGroup(ListNode head, int k) {
          if(head==null){
        return head;
       }
     ListNode temp=head;
     //check if there s enough node to revsrese
     for(int i=0;i<k;i++){
    if(temp==null){
        return head;
    }
    temp=temp.next;
     }
     ListNode curr=head;
     ListNode prev=null;
     ListNode next=null;
     int cnt=0; //to track reversed nodes
     while(curr!=null &&cnt<k){
        next=curr.next;//asve next node
        curr.next=prev;
        prev=curr;
        curr=next;
        cnt++;
     }
     if(next!=null){
        //curr.next!=null   if we didint  still not found the last node revrse recurssively
        //remaing elemnts
        head.next =reverseKGroup(next,k);   //cuurnt.next ->k tak rotate krp
     }
     return prev;
    }
}