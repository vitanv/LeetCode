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
    private ListNode nextNode;
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left == 1){
            return reverseList(head, right);
        }
        head.next = reverseBetween(head.next, left - 1, right - 1);
        return head;
    }
    public ListNode reverseList(ListNode head, int right) {
        if(right == 1){
            nextNode = head.next;
            return head;
        }
        ListNode answer = reverseList(head.next, right - 1);
        head.next.next = head;
        head.next = nextNode;
        return answer;
    }
}