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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder == null || postorder == null || postorder.length != inorder.length) return null;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0;i < inorder.length;i++){
            map.put(inorder[i],i);
        }
        return build(inorder, 0, inorder.length-1, postorder, 0, postorder.length-1, map);
    }
    public TreeNode build(int[] inorder, int inStart, int inEnd,int[] postorder,int postStart,int postEnd,HashMap<Integer, Integer> map){
        if(inStart > inEnd || postStart > postEnd) return null;
        TreeNode root = new TreeNode(postorder[postEnd]);
        int rootIndex = map.get(postorder[postEnd]);
        TreeNode left = build(inorder, inStart, rootIndex-1, postorder,postStart, postStart+rootIndex-inStart-1, map);
        TreeNode right = build(inorder,rootIndex + 1, inEnd,postorder, postStart+rootIndex-inStart,postEnd-1,map);
        root.left = left;
        root.right = right;
        return root;
    }
}