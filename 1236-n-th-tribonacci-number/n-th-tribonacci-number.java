class Solution {
    int dp[];
    public int trirec(int n){
        if(n==0)
        return 0;
        else if(n==1)
        return 1;
        else if(n==2)
        return 1;
        else if(dp[n]!=-1)
        return dp[n];
        else 
        dp[n]=trirec(n-1)+trirec(n-2)+trirec(n-3);
        return dp[n];
    }
    public int tribonacci(int n) {
        dp=new int[n+1];
        for(int i=0;i<n+1;i++)
        dp[i]=-1;
        return trirec(n);
    }
}