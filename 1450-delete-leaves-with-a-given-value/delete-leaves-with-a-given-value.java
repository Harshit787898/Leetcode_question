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
    public void solve(TreeNode root,int t,TreeNode prev){
        if(root==null){
            return;
        }
        solve(root.left,t,root);
        solve(root.right,t,root);
        if(root.left==null&&root.right==null){
            if(root.val==t){
                if(root==prev.left){
                    prev.left=null;
                }
                else{
                    prev.right=null;
                }
            }
        }
    }
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        solve(root,target,root);
        if(root.left==null&&root.right==null){
            if(root.val==target){
                root=null;
            }
        }
        return root;
    }
}