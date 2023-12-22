class Solution {
   public int left(String s){
        int c=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0')
                c++;
        }
        return c;
    }
    public int right(String s){
        int c=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1')
                c++;
        }
        return c;
    }
    public int maxScore(String s) {
        int k=2;
        int ans=0;
        if(s.length()==2){
            if(s.charAt(0)=='0'&&s.charAt(1)=='0')
            return 1;
            else if(s.charAt(0)=='0'&&s.charAt(1)=='1')
            return 2;
            else if(s.charAt(0)=='1'&&s.charAt(1)=='0')
            return 0;
            else return 1;
        }
        for(int i=0;i<s.length();i++){
            int co=0;
            if(k<s.length())
            co=left(s.substring(0,k));
            int c1=right(s.substring(k-1,s.length()));
            int sum=c1+co;
            ans=Math.max(ans,sum);
            k++;
        }
        return ans;
    }
}