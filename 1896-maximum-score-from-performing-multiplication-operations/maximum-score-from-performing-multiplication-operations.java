class Solution {
    int dp[][];
    public int help(int []nums,int []mul,int s,int i){
        int m=mul.length;
        if(i==m)
        return 0;
        if(dp[i][s]!=Integer.MIN_VALUE)
        return dp[i][s];
        int e=(nums.length-1)-(i-s);
        int st=mul[i]*nums[s]+help(nums,mul,s+1,i+1);
        int et=mul[i]*nums[e]+help(nums,mul,s,i+1);
        dp[i][s]=Math.max(st,et);
        return dp[i][s];
    }
    public int maximumScore(int[] nums, int[] multipliers) {
        dp=new int[multipliers.length+1][multipliers.length+1];
        for(int i=0;i<multipliers.length+1;i++){
            for(int j=0;j<multipliers.length+1;j++){
                dp[i][j]=Integer.MIN_VALUE;
            }
        }
        return help(nums,multipliers,0,0);
    }
}