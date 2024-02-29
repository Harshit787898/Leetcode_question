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
    HashMap<TreeNode,Integer> map1=new HashMap<>();
    HashMap<TreeNode,Integer> map2=new HashMap<>();
    public int f1(TreeNode root){
        if(root==null){
            return 0;
        }
        if(map1.containsKey(root)){
            return map1.get(root);
        }
        else{
            int put=1+f2(root.left)+f2(root.right);
            int temp1=Integer.MAX_VALUE,temp2=Integer.MAX_VALUE;
            if(root.left!=null){
                temp1=1+f2(root.left.left)+f2(root.left.right)+f1(root.right);
            }
            if(root.right!=null){
                temp2=1+f2(root.right.left)+f2(root.right.right)+f1(root.left);
            }
            int notput=Math.min(temp1,temp2);
            map1.put(root,Math.min(put,notput));
            return map1.get(root);
        }
    }
    public int f2(TreeNode root){
        if(root==null)
        return 0;
        if(map2.containsKey(root)){
            return map2.get(root);
        }
        else{
            int put=1+f2(root.right)+f2(root.left);
            int notput=f1(root.left)+f1(root.right);
            map2.put(root,Math.min(put,notput));
            return map2.get(root);
        }
    }
    public int minCameraCover(TreeNode root) {
        return f1(root);
    }
}