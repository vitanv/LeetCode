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
    public TreeNode createBinaryTree(int[][] descriptions) {
        Set<Integer> set = new HashSet<>();
        HashMap<Integer, TreeNode> map = new HashMap<>();
        for(int[] description : descriptions){
            int parent = description[0];
            int child = description[1];
            boolean left = description[2] == 1;
            if(!map.containsKey(parent)){
                map.put(parent, new TreeNode(parent));
            }
            if(!map.containsKey(child)){
                map.put(child, new TreeNode(child));
            }
            if(left){
                map.get(parent).left = map.get(child);
            }else{
                map.get(parent).right = map.get(child);
            }
            set.add(child);
        }
        for(TreeNode node : map.values()){
            if(!set.contains(node.val)) return node;
        }
        return null;
    }
}