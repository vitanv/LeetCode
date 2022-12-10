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
    long answer = 0, total = 0;
    public int maxProduct(TreeNode root) {
        total = dfs(root);
        dfs(root);
        return (int)(answer  % (1000000000+7));
    }
    public int dfs(TreeNode root){
        if(root == null) return 0;
        int curr = dfs(root.left) + dfs(root.right) + root.val;
        answer = Math.max(answer,(total - curr) * curr);
        return curr;
    }
}