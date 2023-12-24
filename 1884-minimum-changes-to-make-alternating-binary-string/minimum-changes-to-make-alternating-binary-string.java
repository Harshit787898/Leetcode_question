class Solution {
    public int minOperations(String s) {
        int c1=0;
        int c0=0;
        for(int i=0;i<s.length();i++){
            if(i%2==0){
                if(s.charAt(i)=='0')
                c1++;
                else
                c0++;
            }
            else{
                if(s.charAt(i)=='0')
                c0++;
                else
                c1++;
            }
        }
        return Math.min(c0,c1);
    }
}