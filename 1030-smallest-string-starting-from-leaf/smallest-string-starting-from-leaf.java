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
    List<String> temp=new ArrayList<>();
    public void solve(TreeNode root,String path){
        if(root==null){
            return;
        }
        if(root.left==null&&root.right==null){
            path+=(char)(root.val+'a');
            StringBuilder str=new StringBuilder(path);
            temp.add(str.reverse().toString());
            return;
        }
        path+=(char)(root.val+'a');
        solve(root.left,path);
        solve(root.right,path);
    }
    public String smallestFromLeaf(TreeNode root) {
        solve(root,"");
        Collections.sort(temp);
        System.out.println(temp);
        return temp.get(0);
    }
}