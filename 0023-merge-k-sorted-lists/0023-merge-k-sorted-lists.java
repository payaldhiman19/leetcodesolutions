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
   //main logic is add all head from list in priorityqueue and add smallest to curr next and node's next add in queue coz all nodes neex to be in queue
  ListNode dummy=new ListNode(0);
  ListNode curr=dummy;
  PriorityQueue<ListNode>pq=new PriorityQueue<>((a,b)->a.val-b.val);
  for(ListNode li:lists){
    if(li!=null){
        pq.offer(li);
    }
  }
   while(!pq.isEmpty()){
    ListNode node=pq.poll();
    curr.next=node;
    curr=curr.next;
    if(node.next!=null){
        pq.offer(node.next);
    }
   }
   return dummy.next;
    }
}