class Solution {
    public int rob(int[] nums) {
        int dp[]=new int[nums.length+1];
        dp[0]=0;
        dp[1]=nums[0];
        for(int i=2;i<dp.length;i++){
            int rob=nums[i-1]+dp[i-2];
            int notrob=dp[i-1];
            dp[i]=Math.max(rob,notrob);
        }
        return dp[dp.length-1];
    }
}