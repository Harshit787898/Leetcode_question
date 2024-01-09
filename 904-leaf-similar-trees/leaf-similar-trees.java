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
    public void solve(TreeNode root,List<Integer> temp){
       if(root==null)
       return;
       if(root.left==null&&root.right==null)
       temp.add(root.val);
       solve(root.left,temp);
       solve(root.right,temp);
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> temp1=new ArrayList<>();
        List<Integer> temp2=new ArrayList<>();
        solve(root1,temp1);
        solve(root2,temp2);
        return temp1.equals(temp2);
    }
}