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
    public boolean answer = true;
    public boolean isSameTree(TreeNode p, TreeNode q) {
        dfs(p, q);
        return answer;
    }
    public void dfs(TreeNode p, TreeNode q){
        if(q == null && p == null){ 
            return;
        }else{
            if(q == null || p == null){
                answer = false;
                return;
            }            
        }
        if(q.val != p.val){
            answer = false;
            return;
        }
        
        
        dfs(q.left, p.left);
        dfs(q.right, p.right);
    }
}