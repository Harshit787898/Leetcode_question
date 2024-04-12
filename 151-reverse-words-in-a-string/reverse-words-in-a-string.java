import java.util.*;
class Solution {
    public String reverseWords(String s) {
        String str="";
        s.trim();
        StringTokenizer st=new StringTokenizer(s," ");
        while(st.hasMoreTokens()){
            str=st.nextToken()+" "+str;
        }
        return str.toString().trim();
    }
}