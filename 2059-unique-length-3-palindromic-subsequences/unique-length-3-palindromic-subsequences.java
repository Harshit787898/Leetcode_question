class Solution {
    public int countPalindromicSubsequence(String s) {
        HashMap<Character,Integer> r=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(r.containsKey(ch)){
                r.put(ch,r.get(ch)+1);
            }
            else{
                r.put(ch,1);
            }
        }
        HashMap<Character,Integer> l=new HashMap<>();
        HashSet<String> set=new HashSet<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            r.put(ch,r.get(ch)-1);
            for(char c='a';c<='z';c+=1){
                if(l.containsKey(c)){
                    if(l.get(c)>0 && r.get(c)>0){
                        set.add(ch+","+c+","+ch);
                    }
                }
            }
            if(l.containsKey(ch)){
                l.put(ch,l.get(ch)+1);
            }else{
                l.put(ch,1);
            }
        }
        return set.size();
    }
}