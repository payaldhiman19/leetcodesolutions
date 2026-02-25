/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        if(head==null){
            return null;
        }
        Node curr=head;
        while(curr!=null){
            if(curr.child!=null){
                Node childTail=curr.child;
                while(childTail.next!=null){
                    childTail=childTail.next;
                }
                //connect child to curr next
                if(curr.next!=null){
                    childTail.next=curr.next;
                    curr.next.prev=childTail;
                }
                //connect curr to chil
                curr.next=curr.child;
                curr.child.prev=curr;
                curr.child=null;
            }
            curr=curr.next;
        }
        return head;
    }
}