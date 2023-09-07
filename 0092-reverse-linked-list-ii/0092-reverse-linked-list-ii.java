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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null ) return head;
        ListNode curr = head, prev = null, next = null;
        for(int i = 1; i < left ; i++){
            prev = curr;
            curr = curr.next;
        }
        ListNode before = prev,end = curr;
        for(int i = left; i <= right; i++){
            next = curr.next;
            curr.next= prev;
            prev = curr;
            curr = next;
        }
        end.next = curr;
        if(before != null){
            before.next = prev;
        }else{
            head = prev;
        }
        return head;
    }
    
}