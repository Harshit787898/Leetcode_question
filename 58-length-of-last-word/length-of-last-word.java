import java.util.StringTokenizer;  
class Solution {
    public int lengthOfLastWord(String s) {
        StringTokenizer st = new StringTokenizer(s," ");  
        String temp="";
        while(st.hasMoreTokens()){
            temp=st.nextToken();
        }
        return temp.length();
    }
}