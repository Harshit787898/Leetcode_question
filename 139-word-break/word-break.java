class Solution {
    HashMap<Integer,Boolean>map=new HashMap<>();
    public boolean wordBreak(String s, List<String> wordDict) {
        return solve(0,s,wordDict);
    }
    public boolean solve(int i,String s,List<String> set){
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
                }
            }
        }
        map.put(i,ans);
        return map.get(i);
    }
}