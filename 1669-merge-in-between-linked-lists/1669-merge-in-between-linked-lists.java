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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode node = list1;
        for(int i = 0; i < a - 1; i++){
            node = node.next;
        }
        ListNode dummy = node.next;
        node.next = list2;
        while(node.next != null){
            node = node.next;
        }
        for(int i = 0; i <= b - a; i++){
            dummy = dummy.next;
        }
        node.next = dummy;
        return list1;
    }
}