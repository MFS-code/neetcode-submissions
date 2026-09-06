# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def invertTree(self, root: Optional[TreeNode]) -> Optional[TreeNode]:
        
        def invertBranches(node: Optional[TreeNode]) -> Optional[TreeNode]:
            temp = node.left
            node.left = node.right
            node.right = temp
            return node

        def recurring(node: Optional[TreeNode]) -> Optional[TreeNode]:
            if node:
                if node.left:
                    recurring(node.left)
                if node.right:
                    recurring(node.right)
                invertBranches(node)
            return node 

        return recurring(root)