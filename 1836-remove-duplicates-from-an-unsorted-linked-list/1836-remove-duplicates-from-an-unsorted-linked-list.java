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
    public ListNode deleteDuplicatesUnsorted(ListNode head) {
        ListNode answer = new ListNode(0, head);
        ListNode curr = head;
        HashMap<Integer, Integer> map = new HashMap<>();
        while(curr != null){
            map.put(curr.val, map.getOrDefault(curr.val, 0) + 1);
            curr = curr.next;
        }
        curr = answer;
        while(curr != null && curr.next != null){
            if(map.get(curr.next.val) > 1){
                curr.next = curr.next.next;
            }else{
                curr = curr.next;
            }
        }
        return answer.next;
    }
}