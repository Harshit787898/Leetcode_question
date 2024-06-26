class Solution {
    int [][]dp;
    public int solve(String s,int k,int i,char p){
        if(i>=s.length()){
            return 0;
        }
        else if(dp[i][p+1-'a']!=-1){
            return dp[i][p+1-'a'];
        }
        else{
            char ch=s.charAt(i);
            if(p==(char)96||Math.abs(ch-p)<=k){
                dp[i][p+1-'a']=Math.max(1+solve(s,k,i+1,ch),dp[i][p+1-'a']);
            }
            dp[i][p+1-'a']=Math.max(dp[i][p+1-'a'],solve(s,k,i+1,p));
            return dp[i][p+1-'a'];
        }
    }
    public int longestIdealString(String s, int k) {
        if(s.length()==0)
        return 0;
        dp=new int[s.length()][27];
        for(int i=0;i<s.length();i++){
            for(int j=0;j<27;j++){
                dp[i][j]=-1;
            }
        }
        return solve(s,k,0,(char)96);
    }
}