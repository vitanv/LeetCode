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
    public int minDiffInBST(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        dfs(root);
        Collections.sort(list);
        int answer = Integer.MAX_VALUE;
        for(int i = 1; i < list.size() ;i++){
            if(list.get(i) - list.get(i-1) < answer) answer = list.get(i) - list.get(i-1);
        }
        return answer;
    }
    public void dfs(TreeNode root){
        if(root == null) return;
        list.add(root.val);
        dfs(root.left);
        dfs(root.right);
    }
}