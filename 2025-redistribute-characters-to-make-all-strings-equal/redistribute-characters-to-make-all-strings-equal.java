class Solution {
    public boolean makeEqual(String[] words) {
        if(words.length==1)
        return true;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<words.length;i++){
            String s=words[i];
            for(int j=0;j<s.length();j++){
                if(map.containsKey(s.charAt(j))){
                    map.put(s.charAt(j),map.get(s.charAt(j))+1);
                }
                else{
                    map.put(s.charAt(j),1);
                }
            }
        }
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            if(entry.getValue()%words.length!=0)
            return false;
        }
        return true;
    }
}