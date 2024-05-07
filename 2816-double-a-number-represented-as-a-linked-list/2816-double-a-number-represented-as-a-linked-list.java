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
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode answer = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return answer;
    }
    public ListNode doubleIt(ListNode head) {
        int carry = 0;
        ListNode answer = new ListNode(0);
        ListNode curr = answer;
        ListNode reversed = reverseList(head);
        while(reversed != null){
            int prod = carry + reversed.val *2;
            curr.val = prod % 10;
            carry = prod / 10;
            if(reversed.next != null){
                curr.next = new ListNode(0);
                curr = curr.next;
            }
            reversed = reversed.next;
        }
        if(carry > 0){
            curr.next = new ListNode(carry);
        }
        return reverseList(answer);
    }
}