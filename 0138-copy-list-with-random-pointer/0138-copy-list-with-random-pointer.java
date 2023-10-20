/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head == null) return head;
        HashMap<Node, Node> map = new HashMap<Node, Node>();
        Node answer = new Node(head.val, null, null);
        Node currOld = head, currNew = answer;
        map.put(currOld, currNew);
        currOld = currOld.next;
        while(currOld != null){
            currNew.next = new Node(currOld.val, null, null);
            currNew = currNew.next;
            map.put(currOld, currNew);
            currOld = currOld.next;
        }
        currOld = head; 
        currNew = answer;
        while(currOld != null && currNew !=null){
            if(currOld.random != null) currNew.random = map.get(currOld.random);
            currOld = currOld.next;
            currNew = currNew.next;
        }
        return answer;
    }
}