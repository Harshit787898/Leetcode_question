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
    public int solve(TreeNode root,int ans){
        if(root==null)
        return 0;
        ans=ans*10+root.val;
        if(root.left==null&&root.right==null){
            return ans;
        }
        int l=solve(root.left,ans);
        int r=solve(root.right,ans);
        return l+r;
    }
    public int sumNumbers(TreeNode root) {
        return solve(root,0);
    }
}