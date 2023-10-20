/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if (node == null) return null;
        Node answer = new Node();
        answer.val = node.val;
        Node[] visited = new Node[101];
        Arrays.fill(visited , null);
        dfs(answer, node, visited);
        return answer;
    }
    public void dfs(Node answer , Node node, Node[] visited){
        visited[answer.val] = answer;
        for(Node n : node.neighbors){
            if(visited[n.val] == null){
                Node dummy = new Node();
                dummy.val = n.val;
                answer.neighbors.add(dummy);
                dfs(dummy, n, visited);
            }else{
                answer.neighbors.add(visited[n.val]);
            }
        }
    }
}