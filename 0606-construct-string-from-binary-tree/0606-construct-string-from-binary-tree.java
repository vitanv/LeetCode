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
    public String tree2str(TreeNode root) {
        if(root == null) return "";
        StringBuilder answer = new StringBuilder();
        dfs(root, answer);
        answer.deleteCharAt(answer.length() - 1);
        
        return answer.toString();
    }
    
    public void dfs(TreeNode root, StringBuilder answer){
        if(root == null){
            answer.append(")");
            return;
        }
        
        answer.append(root.val);
        if(root.left == null && root.right == null){
        }else if(root.left != null && root.right == null){
            dfs(root.left, answer.append("("));
        }else{
            dfs(root.left, answer.append("("));
            dfs(root.right, answer.append("("));
        }
        
        answer.append(")");
    }
}