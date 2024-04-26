class Solution {
    public int minFallingPathSum(int[][] grid) {
        for(int i=1;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                int temp=Integer.MAX_VALUE;
                for(int k=0;k<grid[0].length;k++){
                    if(k!=j){
                        temp=Math.min(temp,grid[i-1][k]);
                    }
                }
                grid[i][j]+=temp;
            }
        }
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<grid.length;i++){
            ans=Math.min(ans,grid[grid.length-1][i]);
        }
        return ans;
    }
}