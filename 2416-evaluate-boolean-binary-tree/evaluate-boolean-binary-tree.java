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
    public boolean solve(TreeNode root){
        if(root==null)
        return true;
        else if(root.left==null&&root.right==null)
        {
            if(root.val==0)
            return false;
            else
            return true;
        }
        else{
            boolean l=evaluateTree(root.left);
            boolean r=evaluateTree(root.right);
            if(root.val==2)
            return l||r;
            else
            return l&&r;
        }
    }
    public boolean evaluateTree(TreeNode root) {
        return solve(root);
    }
}