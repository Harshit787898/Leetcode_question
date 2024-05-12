class Solution {
    public int solve(int[][] grid,int m,int n){
        int max=Integer.MIN_VALUE;
        for(int i=m;i<m+3;i++){
            for(int j=n;j<n+3;j++){
                max=Math.max(max,grid[i][j]);
            }
        }
        return max;
    }
    public int[][] largestLocal(int[][] grid) {
        int ans[][]=new int[grid.length-2][grid.length-2];
        for(int i=0;i<grid.length-2;i++){
            for(int j=0;j<grid.length-2;j++){
                ans[i][j]=solve(grid,i,j);
            }
        }
        return ans;
    }
}