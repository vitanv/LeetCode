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
    HashMap<Integer, Integer> map;
    public int[] findMode(TreeNode root) {
        map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        dfs(root);
        int max = 0;
        for(int key: map.keySet()){
            max = Math.max(max, map.get(key));
        }
        for(int key: map.keySet()){
            if(map.get(key) == max){
                list.add(key);
            }
        }
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size();i++){
            answer[i] = list.get(i);
        }
        return answer;
        
    }
    public void dfs(TreeNode node){
        if(node == null) return;
        map.put(node.val, map.getOrDefault(node.val, 0) + 1);
        dfs(node.left);
        dfs(node.right);
    }
}