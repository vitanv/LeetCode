/**
 * Definition for Node.
 * public class Node {
 *     int val;
 *     Node left;
 *     Node right;
 *     Node random;
 *     Node() {}
 *     Node(int val) { this.val = val; }
 *     Node(int val, Node left, Node right, Node random) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *         this.random = random;
 *     }
 * }
 */

class Solution {
    // Hashmap to map old tree's nodes with new tree's nodes.
    private HashMap<Node, NodeCopy> newOldPairs = new HashMap<>();

    private  NodeCopy deepCopy(Node root) {
        if (root == null) {
            return null;
        }
        NodeCopy newRoot = new NodeCopy(root.val);
        newRoot.left = deepCopy(root.left);
        newRoot.right = deepCopy(root.right);
        newOldPairs.put(root, newRoot);
        return newRoot;
    }

    private void mapRandomPointers(Node oldNode) {
        if (oldNode == null) {
            return;
        }
        NodeCopy newNode = newOldPairs.get(oldNode);
        Node oldNodeRandom = oldNode.random;
        NodeCopy newNodeRandom = newOldPairs.get(oldNodeRandom);
        newNode.random = newNodeRandom;
        mapRandomPointers(oldNode.left);
        mapRandomPointers(oldNode.right);
    }

    public NodeCopy copyRandomBinaryTree(Node root) {
        NodeCopy newRoot = deepCopy(root);
        mapRandomPointers(root);
        return newRoot;
    }
}