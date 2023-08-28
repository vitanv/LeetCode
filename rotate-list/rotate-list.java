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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode curr = head;
        if (curr == null || k == 0) return head;
        int nodes = 1;
        while( curr.next != null){
            curr = curr.next;
            nodes++;
        }
        k %= nodes;
        while(k>0){
            k--;
            ListNode temp = head;
            int prev = temp.val;
            temp = temp.next;
            while(temp !=null){
                int swap = temp.val;
                temp.val = prev;
                prev = swap;
                temp = temp.next;
            }
            head.val = prev;
        }
        return head;
    }
}