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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode curr = head;
        while(curr.next != null){
            int temp = gcd(curr.val, curr.next.val);
            ListNode dummy = new ListNode(temp);
            dummy.next = curr.next;
            curr.next = dummy;
            curr = curr.next.next;
        }
        return head;
    }
    public int gcd(int a, int b){
        if(b == 0){
            return a;
        }else{
            return gcd(b, a % b);
        }
    }
}