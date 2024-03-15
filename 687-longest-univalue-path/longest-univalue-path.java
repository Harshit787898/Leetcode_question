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
     int max=0;
    public int solve(TreeNode root){
        if(root==null)
        return 0;
        int l=solve(root.left);
        int r=solve(root.right);
        int val=0;
        if(root.left!=null&&root.right!=null){
            if(root.val==root.left.val&&root.val==root.right.val)
            max=Math.max(l+r+2,max);
        }
        if(root.left!=null){
            if(root.val==root.left.val)
            val=Math.max(val,l+1);
        }
        if(root.right!=null){
            if(root.val==root.right.val)
            val=Math.max(val,r+1);
        }
        max=Math.max(val,max);
        return val;
    }
    public int longestUnivaluePath(TreeNode root) {
        int t= solve(root);
        return max;
    }
}