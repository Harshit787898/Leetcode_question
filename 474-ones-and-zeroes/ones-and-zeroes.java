class Solution {
    HashMap<String,Integer> map=new HashMap<>();
    public int zeros(String s){
        int c=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0')
            c++;
        }
        return c;
    }
    public int solve(int i,int m,int n,String[] strs){
        if(i==strs.length)
        return 0;
        String key = i + "," + m + "," + n;
        if(map.containsKey(key)){
            return map.get(key);
        }
        else{
            int ans=solve(i+1,m,n,strs);
            int z=zeros(strs[i]);
            int o=strs[i].length()-z;
            if(m>=z&&n>=o){
                ans=Math.max(ans,1+solve(i+1,m-z,n-o,strs));
            }
            map.put(key,ans);
            return map.get(key);
        }
    }
    public int findMaxForm(String[] strs, int m, int n) {
        return solve(0,m,n,strs);
    }
}