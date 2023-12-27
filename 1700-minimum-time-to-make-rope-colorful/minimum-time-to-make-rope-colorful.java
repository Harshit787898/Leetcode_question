class Solution {
    public int solve(String colors,int[] t,int i){
        if(i==colors.length())
        return 0;
        if(i<colors.length()-1 && colors.charAt(i)==colors.charAt(i+1)){
            if(t[i+1]<t[i]){
                int temp=t[i+1];
                t[i+1]=t[i];
                t[i]=temp;
            }
            return Math.min(t[i],t[i+1])+solve(colors,t,i+1);
        }
        else{
            return solve(colors,t,i+1);
        }
    }
    public int minCost(String colors, int[] neededTime) {
        return solve(colors,neededTime,0);
    }
}