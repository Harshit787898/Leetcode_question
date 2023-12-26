class Solution1 {
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

class Solution {
    public int minDistance(String s1, String s2) {
        int dp[][]=new int[s1.length()+1][s2.length()+1];
        for(int i=0;i<s1.length()+1;i++){
            dp[i][0]=i;
        }
        for(int i=0;i<s2.length()+1;i++){
            dp[0][i]=i;
        }
        for(int i=1;i<s1.length()+1;i++){
            for(int j=1;j<s2.length()+1;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1];
                }
                else{
                    int del=1+dp[i-1][j];
                    int ins=1+dp[i][j-1];
                    int rep=1+dp[i-1][j-1];
                    dp[i][j]=Math.min(del,Math.min(ins,rep));
                }
            }
        }
        return dp[s1.length()][s2.length()];
    }
}