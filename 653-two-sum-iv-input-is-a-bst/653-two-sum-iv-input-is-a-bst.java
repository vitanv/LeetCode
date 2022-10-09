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
    List<Integer> list = new ArrayList<>();
    public boolean findTarget(TreeNode root, int k) {
        dfs(root);  
        Collections.sort(list);
        int size = list.size() - 1;
        int i = 0;
        while(i < size){
            int total = list.get(i) + list.get(size);
            if(total > k) size--;
            if(total < k) i++;
            if(total == k) return true;
        }
        return false;
    }
    public void dfs(TreeNode node){
        if(node == null) return;
        dfs(node.left);
        list.add(node.val);
        dfs(node.right);
    }
}