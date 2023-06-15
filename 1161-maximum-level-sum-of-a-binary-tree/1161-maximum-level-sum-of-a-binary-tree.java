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
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int level = 1, answer = 1, max = Integer.MIN_VALUE;
        HashMap<Integer, Integer> map = new HashMap<>();
        while(!q.isEmpty()){
            int size = q.size();
            for(int i = 0; i < size; i++){
                map.put(level,map.getOrDefault(level, 0) + q.peek().val);
                if(q.peek().left != null) q.offer(q.peek().left);
                if(q.peek().right != null) q.offer(q.peek().right);
                q.poll();
            }
            level++;
        }
        for(int i : map.keySet()){
            if(map.get(i) > max){
                max = map.get(i);
                answer = i;
            }
        }
        return answer;
    }
}