class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        HashSet<String> set=new HashSet<>();
        for(String s:wordList){
            set.add(s);
        }
        Queue<Pair<String,Integer>> q=new LinkedList<>();
        Pair<String,Integer> p=new Pair<String,Integer>(beginWord,1);
        q.add(p);
        if(set.contains(beginWord)){
            set.remove(beginWord);
        }
        while(!q.isEmpty()){
            Pair<String,Integer>temp=q.poll();
            String word=temp.getKey();
            int ans=temp.getValue();
            char[] res=word.toCharArray();
            if(word.equals(endWord)){
                return ans;
            }
            for(int i=0;i<word.length();i++){
                for(char x='a';x<='z';x++){
                    char t=res[i];
                    res[i]=x;
                    String tw=new String(res);
                    if(set.contains(tw)){
                        q.add(new Pair<String,Integer>(tw,ans+1));
                        set.remove(tw);
                    }
                    res[i]=t;
                }
            }
        }
        return 0;
    }
}