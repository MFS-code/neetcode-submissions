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
    public int maxDepth(TreeNode root) {
        return depthRecursive(root, 0);
    }

    public int depthRecursive(TreeNode curr, int depth) {
        if (curr == null) return depth;
        return Math.max(depthRecursive(curr.left, depth), depthRecursive(curr.right, depth)) + 1;
    }
}
