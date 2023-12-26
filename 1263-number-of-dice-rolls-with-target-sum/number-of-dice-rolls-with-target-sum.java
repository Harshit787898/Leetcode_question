class Solution {
    int mod=1000000007;
    int dp[][];
    public int solve(int n,int k,int t){
        if(n==0 && t==0)
        return 1;
        if(n==0 || t<0)
        return 0;
        if(dp[n][t]!=-1)
        return dp[n][t];
        int sum=0;
        for(int i=1;i<=k;i++){
            sum=(sum+solve(n-1,k,t-i))%mod;
        }
        dp[n][t]=sum;
        return dp[n][t];
    }
    public int numRollsToTarget(int n, int k, int target) {
        dp=new int[n+1][target+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=target;j++){
                dp[i][j]=-1;
            }
        }
        return solve(n,k,target);
    }
}