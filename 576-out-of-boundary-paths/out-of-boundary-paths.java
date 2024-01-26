class Solution {
    long[][][] dp;
    public long solve(int x,int y,int m,int r,int c){
        if (r<0||r>=x||c<0||c>=y) {
            return 1;
        }
        if(dp[r][c][m]!=-1){
            return dp[r][c][m];
        }
        long u=0,d=0,l=0,ri=0;
        if(m>0){
            u=solve(x,y,m-1,r-1,c);
        }
        if(m>0){
            d=solve(x,y,m-1,r+1,c);
        }
        if(m>0){
            l=solve(x,y,m-1,r,c-1);
        }
        if(m>0){
            ri=solve(x,y,m-1,r,c+1);
        }
        return dp[r][c][m]=(l+ri+u+d)%(1000000000+7);
    }
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        dp = new long[m][n][maxMove + 1];
        for (long[][] i : dp) {
            for (long[] j : i) {
                Arrays.fill(j, -1);
            }
        }
        return (int)solve(m, n, maxMove, startRow, startColumn);
    }
}