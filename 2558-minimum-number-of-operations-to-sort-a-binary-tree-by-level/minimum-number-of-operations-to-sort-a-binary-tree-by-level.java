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
    public int solve(ArrayList<Integer> temp){
        int n = temp.size();
        List<int[]> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(new int[] {temp.get(i), i});
        }
        arr.sort((a, b) -> Integer.compare(a[0], b[0]));
        boolean[] visited = new boolean[n];
        int swaps = 0;
        for (int i = 0; i < n; i++) {
            if (visited[i] || arr.get(i)[1] == i) {
                continue;
            }
            int j = i, cycleSize = 0;
            while (!visited[j]) {
                visited[j] = true;
                j = arr.get(j)[1];
                cycleSize++;
            }
            if (cycleSize > 1) {
                swaps += (cycleSize - 1);
            }
        }
        return swaps;
    }
    public int minimumOperations(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        int ans=0;
        while(!q.isEmpty()){
            int n=q.size();
            ArrayList<Integer> temp=new ArrayList<>();
            while(n!=0){
                TreeNode t=q.poll();
                temp.add(t.val);
                if(t.left!=null){
                    q.offer(t.left);
                }
                if(t.right!=null){
                    q.offer(t.right);
                }
                n-=1;
            }
            ans+=solve(temp);
        }
        return ans;
    }
}