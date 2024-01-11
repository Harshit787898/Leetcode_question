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
    int ans=0;
    public void help(TreeNode root,int max,int min){
        if(root==null)
        return ;
        max=Math.max(max,root.val);
        min=Math.min(min,root.val);
        if(root.left==null&&root.right==null){
            ans=Math.max(ans,Math.abs(max-min));
        return ;
        }
        help(root.left,max,min);
        help(root.right,max,min);
    }
    public int maxAncestorDiff(TreeNode root) {
        if(root==null)
        return 0;
        help(root,root.val,root.val);
        return ans;
    }
}