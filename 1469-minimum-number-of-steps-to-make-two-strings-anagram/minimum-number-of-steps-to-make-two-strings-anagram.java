class Solution {
    public int minSteps(String s, String t) {
        HashMap<Character,Integer> smap=new HashMap<>();
        HashMap<Character,Integer> tmap=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(smap.containsKey(s.charAt(i))){
                smap.put(s.charAt(i),smap.get(s.charAt(i))+1);
            }
            else{
                smap.put(s.charAt(i),1);
            }
        }
        for(int i=0;i<t.length();i++){
            if(tmap.containsKey(t.charAt(i))){
                tmap.put(t.charAt(i),tmap.get(t.charAt(i))+1);
            }
            else{
                tmap.put(t.charAt(i),1);
            }
        }
        int c=0;
        for(Map.Entry<Character,Integer> entry: smap.entrySet()){
            char ch=entry.getKey();
            int sval=entry.getValue();
            int tval=0;
            if(tmap.containsKey(ch)){
                tval=tmap.get(ch);
            }
            c+=Math.max(0,sval-tval);
        }
        return c;
    }
}