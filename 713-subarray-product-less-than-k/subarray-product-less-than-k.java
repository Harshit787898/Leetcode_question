class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int ws=0;
        int we=0;
        int ans=0;
        int pro=1;
        while(we<nums.length){
            pro=pro*nums[we];
            while(ws<we&&pro>=k){
                pro=pro/nums[ws];
                ws++;
            }
            if(pro<k){
                ans+=we-ws+1;
            }
            we++;
        }
        return ans;
    }
}