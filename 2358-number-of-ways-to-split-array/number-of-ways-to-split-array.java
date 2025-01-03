class Solution {
    public int waysToSplitArray(int[] nums) {
        long ls[]=new long[nums.length];
        long rs[]=new long[nums.length];
        ls[0]=nums[0];
        rs[nums.length-1]=nums[nums.length-1];
        for(int i=1;i<nums.length;i++){
            ls[i]=nums[i]+ls[i-1];
        }
        for(int i=nums.length-2;i>=0;i--){
            rs[i]=nums[i]+rs[i+1];
        }
        int ans=0;
        for(int i=0;i<nums.length-1;i++){
            if(ls[i]>=rs[i+1]){
                ans+=1;
            }
        }
        return ans;
    }
}