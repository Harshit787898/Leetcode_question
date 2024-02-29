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
    public boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        int flag=0;
        while(!q.isEmpty()){
            int l=q.size();
            List<Integer> sort=new ArrayList<>();
            for(int i=0;i<l;i++){
                TreeNode temp=q.poll();
                sort.add(temp.val);
                if(temp.left!=null){
                    q.offer(temp.left);
                }
                if(temp.right!=null){
                    q.offer(temp.right);
                }
            }
            if(flag%2==0){
                for(int i=0;i<sort.size()-1;i++){
                    if(sort.get(i)%2==0||sort.get(i)>=sort.get(i+1))
                    return false;
                }
                if(sort.get(sort.size()-1)%2==0)
                return false;
            }
            else{
                for(int i=0;i<sort.size()-1;i++){
                    if(sort.get(i)%2!=0||sort.get(i)<=sort.get(i+1))
                    return false;
                }
                if(sort.get(sort.size()-1)%2!=0)
                return false;
            }
            flag++;
        }
        return true;
    }
}