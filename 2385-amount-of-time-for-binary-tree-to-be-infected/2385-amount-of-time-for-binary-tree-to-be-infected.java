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
    public int amountOfTime(TreeNode root, int start) {
        int answer = 0;
        HashMap<Integer, Set<Integer>> map = new HashMap<>();
        convert(root, 0, map);
        Queue<Integer> q = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        visited.add(start);
        q.add(start);
        while(!q.isEmpty()){
            int size = q.size();
            for(int i = 0; i < size;i++){
                int node = q.poll();
                for(int num: map.get(node)){
                    if(!visited.contains(num)){
                        visited.add(num);
                        q.add(num);
                    }
                }   
            }
            answer++;
        }
        return answer - 1;
    }
    public void convert(TreeNode node, int parent, Map<Integer, Set<Integer>> map){
        if(node == null) return;
        if(!map.containsKey(node.val)) map.put(node.val, new HashSet<>());
        Set<Integer> set = map.get(node.val);
        if(parent != 0) set.add(parent);
        if(node.left != null) set.add(node.left.val);
        if(node.right != null) set.add(node.right.val);
        convert(node.left, node.val, map);
        convert(node.right, node.val, map);
    }
}