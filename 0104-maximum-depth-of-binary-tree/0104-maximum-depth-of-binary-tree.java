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
    private int maxDepth = 0;

    public int maxDepth(TreeNode root) {
        traversal(root, 0);
        return maxDepth;
    }

    public void traversal(TreeNode node, int depth) {
        if(Objects.isNull(node)) {
            maxDepth = Math.max(maxDepth, depth);
            return;
        }

        traversal(node.left, depth+1);
        traversal(node.right, depth+1);
    }
}