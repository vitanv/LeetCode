public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> s1 = new Stack<Integer>();
        Stack<Integer> s2 = new Stack<Integer>();
        
        while(l1 != null) {
            s1.push(l1.val);
            l1 = l1.next;
        };
        while(l2 != null) {
            s2.push(l2.val);
            l2 = l2.next;
        }
        
        int totalSum = 0, carry = 0;
        ListNode answer = new ListNode();
        while (!s1.empty() || !s2.empty()) {
            if (!s1.empty()) totalSum += s1.pop();
            if (!s2.empty()) totalSum += s2.pop();
            
            answer.val = totalSum % 10;
            carry = totalSum / 10;
            ListNode head = new ListNode(carry);
            head.next = answer;
            answer = head;
            totalSum = carry;
        }

        if(carry == 0) return answer.next;
        return answer;
    }
}