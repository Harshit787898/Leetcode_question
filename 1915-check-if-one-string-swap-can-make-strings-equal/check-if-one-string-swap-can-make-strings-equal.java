class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.length()!=s2.length()){
            return false;
        }
        int c=0;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i) != s2.charAt(i)){
                c++;
            }
        }
        if(c==0){
            return true;
        }else if(c==2){
            int t[]=new int[2];
            int k=0;
            for(int i=0;i<s1.length();i++){
                if(s1.charAt(i) != s2.charAt(i)){
                    t[k++]=i;
                }
            }
            if(s1.charAt(t[0])==s2.charAt(t[1]) && s1.charAt(t[1])==s2.charAt(t[0])){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
}