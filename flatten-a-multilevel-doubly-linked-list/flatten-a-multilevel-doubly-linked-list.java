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
        if(head == null) return head;
        Node curr = head;
        while(curr != null){
            if(curr.child != null){
                Node c = curr.child;
                Node n = curr.next;
                curr.child = null;
                curr.next = c;
                c.prev = curr;
                while(c.next != null) c = c.next;
                if(n != null)n.prev = c;
                c.next = n;
            }
            curr = curr.next;
        }
        return head;
    }
}