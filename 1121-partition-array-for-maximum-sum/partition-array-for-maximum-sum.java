class Solution {
    int []dp;
    public int solve(int a[],int i,int k){
        if(i>=a.length){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int ans=Integer.MIN_VALUE;
        int max=Integer.MIN_VALUE;
        int sum=Integer.MIN_VALUE;
        int len=0;
        for(int in=i;in<Math.min(a.length,i+k);in++){
            len+=1;
            max=Math.max(max,a[in]);
            sum=(len*max) + solve(a,in+1,k);
            ans=Math.max(ans,sum);
        }
        return dp[i]=ans;
    }
    public int maxSumAfterPartitioning(int[] arr, int k) {
        dp=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            dp[i]=-1;
        }
        return solve(arr,0,k);
    }
}