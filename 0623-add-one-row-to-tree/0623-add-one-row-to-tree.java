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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth == 1){
            TreeNode node = new TreeNode(val);
            node.left = root;
            return node;
        }
        dfs(root, val,1,depth);
        return root;
    }
    public void dfs(TreeNode node, int val, int current, int depth){
        if(node == null) return;
        if(current == depth - 1){
            TreeNode temp = node.left;
            node.left = new TreeNode(val,temp,null);
            temp = node.right;
            node.right = new TreeNode(val,null,temp);
            
        } else{
            dfs(node.left, val, current+1, depth);
            dfs(node.right, val, current+1, depth);
        }
    }
}