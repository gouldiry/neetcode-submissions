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

public class Solution {
    List<List<Integer>> newList = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        dfs(root, 0);
        return newList;
    }
    private void dfs(TreeNode root, int depth){
        if(root == null) return;
        if(newList.size() == depth){
            newList.add(new ArrayList<>());
        }
        newList.get(depth).add(root.val);
        dfs(root.left, depth + 1);
        dfs(root.right, depth + 1);

    }
}