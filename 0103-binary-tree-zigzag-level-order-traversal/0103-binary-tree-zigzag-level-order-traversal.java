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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root == null) return new ArrayList<List<Integer>>();
        List<List<Integer>> answer = new ArrayList<>();
        LinkedList<TreeNode> nodes = new LinkedList<>();
        
        nodes.addLast(root);
        nodes.addLast(null);
        
        LinkedList<Integer> level = new LinkedList<>();
        boolean goingLeft = true;
        
        while(nodes.size()> 0){
            TreeNode temp = nodes.pollFirst();
            if(temp != null){
                if(goingLeft){
                    level.addLast(temp.val);
                }else{
                    level.addFirst(temp.val);
                }
                if(temp.left != null) nodes.addLast(temp.left);
                if(temp.right != null) nodes.addLast(temp.right);
            }else{
                answer.add(level);
                level = new LinkedList<Integer>();
                if(nodes.size() > 0) nodes.addLast(null);
                goingLeft = !goingLeft;
            }
        }
        return answer;
    }
}