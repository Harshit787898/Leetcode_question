class Solution {
    public int lengthOfLastWord(String s) {
       s=s.trim();
       int i=s.lastIndexOf(" ");
       String temp=s.substring(i+1,s.length());
       return temp.length();
    }
}