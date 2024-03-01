class Solution {
    public String maximumOddBinaryNumber(String s) {
        int c=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1')
            c++;
        }
        c--;
        String ans="";
        while(c!=0){
            ans=ans+'1';
            c--;
        }
        while(ans.length()!=s.length()-1){
            ans=ans+'0';
        }
        ans=ans+'1';
        return ans;
    }
}