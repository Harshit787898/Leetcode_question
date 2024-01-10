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
    public int amountOfTime(TreeNode root, int start) {
        int t=traverse(root, start);
        return ans;
    }
    public int traverse(TreeNode root,int start){
        int d=0;
        if(root==null)
        return d;
        int ld=traverse(root.left,start);
        int rd=traverse(root.right,start);
        if(root.val==start){
            ans=Math.max(ld,rd);
            d=-1;
        }
        else if(ld>=0&&rd>=0){
            d=Math.max(ld,rd)+1;
        }
        else{
            ans=Math.max(ans,Math.abs(ld)+Math.abs(rd));
            d=Math.min(ld,rd)-1;
        }
        return d;
    }
}   