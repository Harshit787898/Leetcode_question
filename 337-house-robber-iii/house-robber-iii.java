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
    HashMap<TreeNode,Integer>map=new HashMap<>();
    public int solve(TreeNode root){
        if(root==null)
        return 0;
        if(map.containsKey(root)){
            return map.get(root);
        }
        else{
            int rob=root.val;
            if(root.left!=null){
                rob+=solve(root.left.left)+solve(root.left.right);
            }
            if(root.right!=null){
                rob+=solve(root.right.left)+solve(root.right.right);
            }
            int notrob=solve(root.left)+solve(root.right);
            map.put(root,Math.max(rob,notrob));
            return map.get(root);
        }
    }
    public int rob(TreeNode root) {
        return solve(root);
    }
}