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
    public int getDecimalValue(ListNode head) {
        String answer = "";
        answer += head.val;
        while(head.next !=null){
            head = head.next;
            answer += head.val;
        }
        return Integer.parseInt(answer,2);
    }
}