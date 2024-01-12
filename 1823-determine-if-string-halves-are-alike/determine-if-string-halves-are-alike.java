class Solution {
    public int count(String s){
        int c=0;
        for(int i=0;i<s.length();i++){
            if("AEIOUaeiou".indexOf(s.charAt(i))!=-1)
                c++;
        }
        return c;
    }
    public boolean halvesAreAlike(String s) {
        int mid=s.length()/2;
        String a=s.substring(0,mid);
        String b=s.substring(mid,s.length());
        int c1=count(a);
        int c2=count(b);
        if(c1==c2)
        return true;
        else
        return false;
    }
}