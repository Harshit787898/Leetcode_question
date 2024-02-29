class Solution {
    HashMap<Integer,Boolean>map=new HashMap<>();
    public boolean wordBreak(String s, List<String> wordDict) {
        HashSet<String> set=new HashSet<>();
        for(int i=0;i<wordDict.size();i++){
            set.add(wordDict.get(i));
        }
        return solve(0,s,set);
    }
    public boolean solve(int i,String s,HashSet<String> set){
        if(i==s.length())
        return true;
        if(map.containsKey(i)){
            return map.get(i);
        }
        boolean ans=false;
        StringBuilder str=new StringBuilder();
        for(int j=i;j<s.length();j++){
            str.append(s.charAt(j));
            if(set.contains(str.toString())){
                if(solve(j+1,s,set)){
                    ans=true;
                    // break;
                }
            }
        }
        map.put(i,ans);
        return map.get(i);
    }
}