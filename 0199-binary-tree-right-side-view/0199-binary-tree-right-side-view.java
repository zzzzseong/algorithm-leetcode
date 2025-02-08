import java.util.*;

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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> rightSideNodes = new ArrayList<>();
        if(Objects.isNull(root)) return rightSideNodes;

        Deque<TreeNode> before = new ArrayDeque<>();
        Deque<TreeNode> after =  new ArrayDeque<>();

        before.addFirst(root);

        while(!before.isEmpty()) {
            rightSideNodes.add(before.getLast().val);
            insertNodesInDepth(before, after);

            before = after;
            after = new ArrayDeque<>();
        }

        return rightSideNodes;
    }

    /**
    * before의 자식노드들을 after에 담아서 return
    */
    public void insertNodesInDepth(Deque<TreeNode> before, Deque<TreeNode> after) {
        while(!before.isEmpty()) {
            TreeNode node = before.removeFirst();
            if(!Objects.isNull(node.left)) after.addLast(node.left);
            if(!Objects.isNull(node.right)) after.addLast(node.right);
        }
    }
}