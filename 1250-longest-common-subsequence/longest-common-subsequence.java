//Recursive approach with starting from 0th index
class Solution1 {
    int solve(String text1,String text2,int i,int j){
        if(i>=text1.length()||j>=text2.length())
        return 0;
        else{
            if(text1.charAt(i)==text2.charAt(j)){
                return 1+solve(text1,text2,i+1,j+1);
            }
            else{
                return Math.max(solve(text1,text2,i+1,j),solve(text1,text2,i,j+1));
            }
        }
    }
    public int longestCommonSubsequence(String text1, String text2) {
        return solve(text1,text2,0,0);
    }
}


//Recursive approach with starting from (n-1)th index
class Solution2 {
    int solve(String text1,String text2,int i,int j){
        if(i<0||j<0)
        return 0;
        else{
            if(text1.charAt(i)==text2.charAt(j)){
                return 1+solve(text1,text2,i-1,j-1);
            }
            else{
                return Math.max(solve(text1,text2,i-1,j),solve(text1,text2,i,j-1));
            }
        }
    }
    public int longestCommonSubsequence(String text1, String text2) {
        return solve(text1,text2,text1.length()-1,text2.length()-1);
    }
}


//dp solution starting from 0th index
class Solution3 {
    int [][]dp;
    int solve(String text1,String text2,int i,int j){
        if(i>=text1.length()||j>=text2.length())
        return 0;
        else if(dp[i][j]!=-1){
            return dp[i][j];
        }
        else{
            if(text1.charAt(i)==text2.charAt(j)){
                dp[i][j]=1+solve(text1,text2,i+1,j+1);
                return dp[i][j];
            }
            else{
                dp[i][j]=Math.max(solve(text1,text2,i+1,j),solve(text1,text2,i,j+1));
                return dp[i][j];
            }
        }
    }
    public int longestCommonSubsequence(String text1, String text2) {
        dp=new int[text1.length()][text2.length()];
        for(int i=0;i<text1.length();i++){
            for(int j=0;j<text2.length();j++){
                dp[i][j]=-1;
            }
        }
        return solve(text1,text2,0,0);
    }
}



// dp approach starting from (n-1)th index
class Solution4 {
    int [][]dp;
    int solve(String text1,String text2,int i,int j){
        if(i<0||j<0)
        return 0;
        else if(dp[i][j]!=-1){
            return dp[i][j];
        }
        else{
            if(text1.charAt(i)==text2.charAt(j)){
                dp[i][j]=1+solve(text1,text2,i-1,j-1);
                return dp[i][j];
            }
            else{
                dp[i][j]=Math.max(solve(text1,text2,i-1,j),solve(text1,text2,i,j-1));
                return dp[i][j];
            }
        }
    }
    public int longestCommonSubsequence(String text1, String text2) {
        dp=new int[text1.length()][text2.length()];
        for(int i=0;i<text1.length();i++){
            for(int j=0;j<text2.length();j++){
                dp[i][j]=-1;
            }
        }
        return solve(text1,text2,text1.length()-1,text2.length()-1);
    }
}

//Bottom up approach starting from nth index
class Solution5 {
    public int longestCommonSubsequence(String text1, String text2) {
        int [][]dp=new int[text1.length()+1][text2.length()+1];
        for(int i=text1.length()-1;i>=0;i--){
            for(int j=text2.length()-1;j>=0;j--){
                if(text1.charAt(i)==text2.charAt(j)){
                    dp[i][j]=1+dp[i+1][j+1];
                }
                else{
                    dp[i][j]=Math.max(dp[i+1][j],dp[i][j+1]);
                }
            }
        }
        return dp[0][0];
    }
}

//Bottom up approach starting from 0th index
class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int [][]dp=new int[text1.length()+1][text2.length()+1];
        for(int i=1;i<=text1.length();i++){
            for(int j=1;j<=text2.length();j++){
                if(text1.charAt(i-1)==text2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[text1.length()][text2.length()];
    }
}
