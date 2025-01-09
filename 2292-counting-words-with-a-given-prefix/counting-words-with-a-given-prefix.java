class Solution {
    public int prefixCount(String[] words, String pref) {
        int c=0;
        for(int i=0;i<words.length;i++){
            StringBuilder s=new StringBuilder(words[i]);
            if(s.indexOf(pref)==0){
                c++;
            }
        }
        return c;
    }
}