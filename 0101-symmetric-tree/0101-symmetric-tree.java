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
    public boolean isSymmetric(TreeNode root) {
       if (root == null) return true;
       return check(root.right, root.left);
    }
    public boolean check(TreeNode right, TreeNode left){
        if(right == null && left == null) return true;
        if(right == null || left == null || right.val != left.val) return false;
        return check(right.right, left.left) && check(right.left, left.right);
    }
}