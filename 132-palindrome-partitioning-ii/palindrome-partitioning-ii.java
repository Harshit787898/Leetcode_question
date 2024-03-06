class Solution {
    HashMap<Integer,Integer>map=new HashMap<>();
    public boolean isPalin(int i,int j,String s){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j))
            return false;
            i++;
            j--;
        }
        return true;
    }
    public int solve(int i,int j,String s){
        if(i==s.length())
        return -1;
        if(map.containsKey(i))
        return map.get(i);
        else{
            int ans = Integer.MAX_VALUE;
            for (int k = i; k < s.length(); k++) {
                if (isPalin(i, k, s)) {
                    int cuts =1 + solve(k + 1, j, s);
                    ans = Math.min(ans, cuts);
                }
            }
            map.put(i,ans);
            return map.get(i);
        }
    }
    public int minCut(String s) {
        return solve(0,s.length()-1,s);
    }
}