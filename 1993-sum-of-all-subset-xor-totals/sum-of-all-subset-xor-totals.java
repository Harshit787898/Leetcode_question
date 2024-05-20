class Solution {
    public int solve(int[] nums,int i,int xor){
        if(i==nums.length){
            return xor;
        }
        int l=solve(nums,i+1,nums[i]^xor);
        int r=solve(nums,i+1,xor);
        return l+r;
    }
    public int subsetXORSum(int[] nums) {
       return solve(nums,0,0);
    }
}