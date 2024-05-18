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
   int c=0;
   public int help(TreeNode root){
       if(root==null){
            return 0;
        }
        else{
            int lc=help(root.left);
            int rc=help(root.right);
            c+=Math.abs(lc)+Math.abs(rc);
            return root.val+lc+rc-1;
        }
       
    }
    public int distributeCoins(TreeNode root) {
        int ans=help(root);
        return c;
    }
}
