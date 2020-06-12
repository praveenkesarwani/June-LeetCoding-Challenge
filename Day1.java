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

 
//Invert Binary Tree
class Solution {
    public TreeNode invertTree(TreeNode root) {
        // edge case
        if (root == null)
            return null;
        TreeNode tempNode = invertTree(root.left);
        root.left = invertTree(root.right);
        root.right = tempNode;
        return root;
    }
}