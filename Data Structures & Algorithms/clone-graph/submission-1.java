/*
Definition for a Node.
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

public class Solution {
    public Node cloneGraph(Node node) {
        Map<Node, Node> newMap = new HashMap<>();
        return dfs(node, newMap);
    }
    private Node dfs(Node node, Map<Node,Node> newMap){
        if(node == null) return null;
        if(newMap.containsKey(node)){
            return newMap.get(node);
        }
        Node copy = new Node(node.val);
        newMap.put(node, copy);
        for(Node neigh : node.neighbors){
            copy.neighbors.add(dfs(neigh, newMap));
        }
        return copy;
    }
}