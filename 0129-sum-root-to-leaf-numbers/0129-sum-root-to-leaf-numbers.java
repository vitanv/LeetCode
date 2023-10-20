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
    int answer = 0;
    public int sumNumbers(TreeNode root) {
        dfs(root, 0);
        return answer;
    }
    public void dfs(TreeNode root, int curr){
        if(root != null){
            curr = curr * 10 + root.val;
            if(root.left == null && root.right == null) answer += curr;
            dfs(root.left, curr);
            dfs(root.right, curr);
        }
    }
}