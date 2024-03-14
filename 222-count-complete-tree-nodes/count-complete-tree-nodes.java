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
    public int solve(TreeNode root){
        if(root==null)
        return 0;
        if(root.left==null&&root.right==null)
        return 1;
        else{
            int l=solve(root.left);
            int r=solve(root.right); 
            return 1+l+r;
        }
    }
    public int countNodes(TreeNode root) {
        return solve(root);
    }
}