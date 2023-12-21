class Solution {
    public int numDecodings(String s) {
        int n=s.length();
        int dp[]=new int[n+2];
        for(int i=0;i<n+2;i++){
            dp[i]=Integer.MIN_VALUE;
        }
        return help(0,s,dp);
    }
    public int help(int i,String s,int[]dp){
        if(dp[i]!=Integer.MIN_VALUE)
        return dp[i];
        if(i==s.length()){
            dp[i]=1;
            return dp[i];
        }
        if(i==s.length()+1){
            dp[i]=0;
            return dp[i];
        }
        dp[i]=0;
        if(s.charAt(i)>='1' && s.charAt(i)<='9')
        dp[i]+=help(i+1,s,dp);
        int v=0;
        if(i+1<s.length())
        v=10*(s.charAt(i)-'0')+(s.charAt(i+1)-'0');
        if(v>=10&&v<=26)
        dp[i]+=help(i+2,s,dp);
        return dp[i];
    }
}