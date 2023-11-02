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
    public int averageOfSubtree(TreeNode root) {
        int[] answer  = new int[1];
        postOrder(root, answer);
        return answer[0];
    }
    public int[] postOrder(TreeNode node, int[] answer){
        if(node == null) return new int[]{0, 0};
        int[] left = postOrder(node.left, answer);
        int[] right = postOrder(node.right, answer);
        int sum = node.val + left[0] + right[0];
        int count = 1 +left[1] + right[1];
        if(sum / count == node.val){
            answer[0]++;
        }
        return new int[]{sum, count};
    }
}