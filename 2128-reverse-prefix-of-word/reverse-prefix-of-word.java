class Solution {
    public String reverse(String s){
        char ch[]=s.toCharArray();
        int i=0;int j=s.length()-1;
        while(i<j){
            char temp=ch[i];
            ch[i]=ch[j];
            ch[j]=temp;
            i++;j--;
        }
        String str=new String(ch);
        return str;
    }
    public String reversePrefix(String word, char ch) {
        int i=word.indexOf(ch);
        String s=word.substring(0,i+1);
        String temp="";
        if(i+1<word.length()){
            temp=word.substring(i+1,word.length());
        }
        s=reverse(s);
        return s+temp;
    }
}