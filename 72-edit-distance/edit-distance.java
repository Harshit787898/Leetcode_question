class Solution {
    int dp[][];
    public int solve(int i,int j,String s1,String s2){
        if(i<0)
        return j+1;
        if(j<0)
        return i+1;
        if(dp[i][j]!=-1)
        return dp[i][j];
        if(s1.charAt(i)==s2.charAt(j)){
            dp[i][j]=solve(i-1,j-1,s1,s2);
            return dp[i][j];
        }
        else{
            int del=solve(i-1,j,s1,s2)+1;
            int ins=solve(i,j-1,s1,s2)+1;
            int rep=solve(i-1,j-1,s1,s2)+1;
            dp[i][j]=Math.min(del,Math.min(ins,rep));
            return dp[i][j];
        }
    }
    public int minDistance(String word1, String word2) {
        dp=new int[word1.length()][word2.length()];
        for(int i=0;i<word1.length();i++){
            for(int j=0;j<word2.length();j++){
                dp[i][j]=-1;
            }
        }
        return solve(word1.length()-1,word2.length()-1,word1,word2);
    }
}