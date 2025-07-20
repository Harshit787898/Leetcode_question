class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        
        if(n==0){
            return 1;
        }

        int ans=10;
        int cu=9;
        int st=9;
        while(n>1 && st>0){
            cu*=(st--);
            ans+=cu;
            n--;
        }
        return ans;
    }
}