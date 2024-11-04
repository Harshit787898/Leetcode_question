class Solution {
    public String compressedString(String word) {
        StringBuilder str=new StringBuilder();
        for(int i=0;i<word.length();){
            int j=i;
            char ch=word.charAt(i);
            int c=0;
            while(j<word.length() && word.charAt(j)==ch){
                c+=1;
                j+=1;
            }
            while(c>9){
                str.append(9);
                str.append(ch);
                c-=9;
            }
            str.append((char)(c+'0'));
            str.append(ch);
            i=j;
        }
        return str.toString();
    }
}