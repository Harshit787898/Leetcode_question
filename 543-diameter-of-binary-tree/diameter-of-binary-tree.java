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
    int d=0;
     
    public int help(TreeNode root){
         if(root==null){
            return 0;
        }
        if(root.left==null&&root.right==null)
        return 1;
        else{
          int l=0,r=0;
            l=help(root.left);
            r=help(root.right);
           
            d=Math.max(l+r,d);
            return Math.max(l+1,r+1);
        }
        
    }
    public int diameterOfBinaryTree(TreeNode root) {
         int x=help(root);
        return d;
    }
}