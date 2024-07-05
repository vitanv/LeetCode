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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int firstIndex = -1, lastIndex = -1, minDist = Integer.MAX_VALUE, prevVal = head.val, currIndex = 1;
        ListNode curr = head.next;
        while(curr != null && curr.next != null){
            if((prevVal < curr.val && curr.val > curr.next.val) || (prevVal > curr.val && curr.val < curr.next.val)){
                if(firstIndex == -1){
                    firstIndex = currIndex;
                }else{
                    minDist = Math.min(minDist, currIndex - lastIndex);
                }
                lastIndex = currIndex;
            }
            prevVal = curr.val;
            curr = curr.next;
            currIndex++;
        }
        if(firstIndex == -1 || lastIndex == firstIndex) return new int[]{-1, -1};
        return new int[]{minDist, lastIndex -  firstIndex};
    }
}