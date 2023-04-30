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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode answer = new ListNode(0);
        answer.next = head;
        ListNode slow = answer, fast = answer;
        while(fast != null && fast.next != null){
            fast = fast.next;
            n--;
            if(n < 0) slow = slow.next;
        }
        slow.next = slow.next.next;
        return answer.next;
    }
}