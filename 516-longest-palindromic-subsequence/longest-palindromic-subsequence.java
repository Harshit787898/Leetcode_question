class Solution1 {
    int dp[][];
    public int solve(String s1,String s2,int i,int j){
        if(i>=s1.length()||j>=s2.length())
        return 0;
        else if(dp[i][j]!=0)
        return dp[i][j];
        else{
            if(s1.charAt(i)==s2.charAt(j)){
                dp[i][j]=1+solve(s1,s2,i+1,j+1);
                return dp[i][j];
            }
            else{
                dp[i][j]=Math.max(solve(s1,s2,i,j+1),solve(s1,s2,i+1,j));
                return dp[i][j];
            }
        }
    }
    public int longestPalindromeSubseq(String s) {
        StringBuilder str=new StringBuilder();
        str.append(s);
        str.reverse();
        String s2=str.toString();
        dp=new int[s.length()][s2.length()];
        return solve(s,s2,0,0);
    }
}

class Solution {
    public int longestPalindromeSubseq(String s1) {
        StringBuilder str=new StringBuilder();
        str.append(s1);
        str.reverse();
        String s2=str.toString();
        int dp[][]=new int[s1.length()+1][s2.length()+1];
        for(int i=1;i<s1.length()+1;i++){
            for(int j=1;j<s2.length()+1;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else{
                    dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
                }
            }
        }
        return dp[s1.length()][s2.length()];
    }
}