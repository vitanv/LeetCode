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
    public ListNode mergeNodes(ListNode head) {
        ListNode curr = head;
        while(curr != null){
            int sum = 0;
            ListNode dummy = curr.next;
            while(dummy != null && dummy.val != 0){
                sum += dummy.val;
                dummy = dummy.next;
            }
            curr.val = sum;
            if(dummy.next == null){
                curr.next = null;
            }else{
                curr.next = dummy;
            }
            curr = curr.next;
        }
        return head;
    }
}