/*
// Definition for a Node.
class Node {
    public int val;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _next) {
        val = _val;
        next = _next;
    }
};
*/

class Solution {
    public Node insert(Node head, int insertVal) {
        if(head == null){
            Node answer = new Node(insertVal, null);
            answer.next = answer;
            return answer;
        }
        Node curr = head;
        while(true){
            if(curr.val < curr.next.val){
                if(curr.val <= insertVal && insertVal <= curr.next.val){
                    curr.next = new Node(insertVal, curr.next);
                    break;
                }
            }else if(curr.val > curr.next.val){
                if(curr.val <= insertVal || insertVal <= curr.next.val){
                    curr.next = new Node(insertVal, curr.next);
                    break;
                }
            }else{
                if(curr.next == head){
                    curr.next = new Node(insertVal, curr.next);
                    break;
                }
            }
            curr = curr.next;
        }
        return head;
    }
}