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
    List<Integer> list1 = new ArrayList<>();
    List<Integer> list2 = new ArrayList<>();
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        dfs(root1, 1);
        dfs(root2, 2);
        if(list1.size() != list2.size()) return false;
        for(int i = 0; i < list1.size(); i++ ){
            if(list1.get(i) != list2.get(i)) return false;
        }
        return true;
    }
    public void dfs(TreeNode node, int l){
        if(node.left == null && node.right == null){
            if(l == 1) list1.add(node.val);
            if(l == 2) list2.add(node.val);
        }
        if(node.left != null) dfs(node.left, l);
        if(node.right != null) dfs(node.right, l);
    }
}