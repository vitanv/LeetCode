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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] answer = new ListNode[k];
        if(head == null) return answer;
        ListNode curr = head, prev = null;
        int n = 0;
        while(curr != null){
            n++;
            curr = curr.next;
        }
        int diff = n % k;
        curr = head;
        for(int i = 0; curr !=null  && i < k ; i++){
            answer[i] = curr;
            for(int j = 0; j < n/k + (i < diff ? 1 : 0); j++){
                prev = curr;
                curr = curr.next;
            }
            prev.next = null;
        }
        return answer;
    }
}