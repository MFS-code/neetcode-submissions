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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        return traverseTree(root, subRoot);
    }

    public boolean traverseTree(TreeNode current, TreeNode subRoot) {
        if (current == null) return false;
        if (isSameHelp(current, subRoot)) return true;
        return traverseTree(current.left, subRoot) || traverseTree(current.right, subRoot);
    }

    public boolean isSameHelp(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        else if (p == null || q == null) return false;
        if (p.val != q.val) return false;
        return isSameHelp(p.left, q.left) && isSameHelp(p.right, q.right);
    }
}
