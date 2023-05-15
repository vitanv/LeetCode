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
    public ListNode swapNodes(ListNode head, int k) {
        if(head == null || head.next == null) return head;
        ListNode temp = head;
        int size = 0;
        while(temp != null){
            size++;
            temp = temp.next;
        }
        temp = head;
        int[] array = new int[size];
        int i = 0;
        while(temp != null){
            array[i] = temp.val;
            i++;
            temp = temp.next;
        }
        int dummy = array[k - 1];
        array[k - 1] = array[size - k];
        array[size - k] = dummy;
        ListNode answer = new ListNode(array[0]);
        ListNode helper = new ListNode(array[1]);
        answer.next = helper;
        for(int j = 2; j < size; j++){
            ListNode tempNode = new ListNode(array[j]);
            helper.next = tempNode;
            helper = helper.next;
        }
        return answer;
    }
}