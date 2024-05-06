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
    public ListNode removeNodes(ListNode head) {
        ListNode node = head, answer = new ListNode(0);
        Stack<ListNode> stack = new Stack<>();
        while(node != null){
            while(!stack.isEmpty() && node.val > stack.peek().val){
                stack.pop();
            }
            stack.add(node);
            node = node.next;
        }
        answer.next = stack.pop();
        while(!stack.isEmpty()){
            ListNode dummy = answer.next;
            answer.next = stack.pop();
            answer.next.next = dummy;
        }
        return answer.next;
    }
}