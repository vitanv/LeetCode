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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0)
            return null;

        ListNode head=new ListNode(0);
        ListNode headPointer=head;

        PriorityQueue<Integer> minHeap=new PriorityQueue<>();
        for(ListNode list:lists){
            while(list != null){
                minHeap.offer(list.val);
                list=list.next;
            }
        }
        while (!minHeap.isEmpty()){
            head.next=new ListNode(minHeap.poll());
            head=head.next;
        }

        return headPointer.next;
    }
}