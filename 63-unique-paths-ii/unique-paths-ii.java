class Solution {
    int dp[][];
    public int solve(int i,int j,int m,int n,int a[][]){
        if(i==m||j==n){
            return 0;
        }
        if(a[i][j]==1){
            return 0;
        }
        if(i==m-1&&j==n-1){
            return 1;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        return dp[i][j]=solve(i+1,j,m,n,a)+solve(i,j+1,m,n,a);
    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        dp=new int[m+1][n+1];
        for(int i=0;i<m+1;i++){
            for(int j=0;j<n+1;j++){
                dp[i][j]=-1;
            }
        }
        return solve(0,0,m,n,obstacleGrid);
    }
}