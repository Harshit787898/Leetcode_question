class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int i=0;
        int j=tokens.length-1;
        int ans=0;
        int max=0;
        while(i<=j){
            if(power>=tokens[i]){
                ans+=1;
                power-=tokens[i++];
            }
            else{
                ans-=1;
                power+=tokens[j--];
            }
            if(ans<0)break;
            max=Math.max(max,ans);
        }
        return max;
    }
}