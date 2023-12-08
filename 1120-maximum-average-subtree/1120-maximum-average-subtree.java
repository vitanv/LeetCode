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
    double answer;
    public double maximumAverageSubtree(TreeNode root) {
        answer = 0;
        postOrder(root);
        return answer;
    }
    public int[] postOrder(TreeNode node){
        if(node == null) return new int[]{0,0};
        int sum = node.val, count = 1;
        int[] left = postOrder(node.left);
        int[] right = postOrder(node.right);
        
        count+= left[0] + right[0];
        sum+= left[1] + right[1];
        answer = Math.max(answer, (double)sum/ (double)count);
        return new int[]{count, sum};
    }
}