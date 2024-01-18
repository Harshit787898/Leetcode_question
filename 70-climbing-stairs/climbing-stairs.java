class Solution {
    HashMap<Integer,Integer> map=new HashMap<>();
    public int solve(int n){
       if(n==0)
       return 1;
       if(n<0)
       return 0;
       if(map.containsKey(n))
       return map.get(n);
       map.put(n,solve(n-1)+solve(n-2));
       return map.get(n);
    }
    public int climbStairs(int n) {
         return solve(n);
    }
}