class Solution {
    public int solve(int i,int j,int a[][],boolean v[][],int vp){
        if (i < 0 || j < 0 || i >= a.length || j >= a[0].length || v[i][j] || a[i][j]==-1) {
            return 0;
        }
        if (a[i][j]==2) {
            return vp==-1?1:0;
        }
        v[i][j]=true;
        vp--;
        int ans=solve(i+1,j,a,v,vp)+solve(i,j+1,a,v,vp)+solve(i-1,j,a,v,vp)+solve(i,j-1,a,v,vp);
        v[i][j]=false;
        return ans;
    }
    public int uniquePathsIII(int[][] grid) {
        int si=0,sj=0;
        int vp=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]==1){
                    si=i;
                    sj=j;
                }
                if(grid[i][j]==0){
                    vp++;
                }
            }
        }
        boolean visited[][]=new boolean[grid.length+1][grid[0].length+1];
        return solve(si,sj,grid,visited,vp);
    }
}