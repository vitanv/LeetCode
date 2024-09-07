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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSubPath(ListNode head, TreeNode root) {
        if(root == null) return false;
        return check(head, root);
    }
    public boolean check(ListNode head, TreeNode node){
        if(node == null) return false;
        if(dfs(head, node)) return true;
        return check(head, node.left) || check(head, node.right);
    }
    public boolean dfs(ListNode head, TreeNode node){
        if(head == null) return true;
        if(node == null) return false;
        if(node.val != head.val) return false;
        return dfs(head.next, node.left) || dfs(head.next, node.right);
    }
}