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
    public int pairSum(ListNode head) {
        if(head == null) return 0;
        List<Integer> list = new ArrayList<>();
        int answer = 0;
        while(head != null){
            list.add(head.val);
            head = head.next;
        }
        for(int i = 0; i < list.size()/2; i++){
            answer = Math.max(answer, list.get(i)+list.get(list.size() - 1 - i));
        }
        return answer;
    }
}