class Solution {
    public int maxAscendingSum(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int sum=nums[0];
        int msum=nums[0];
        int p=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]<=p){
                msum=Math.max(msum,sum);
                sum=nums[i];
            }
            else{
                sum+=nums[i];
            }
            p=nums[i];
        }
        return Math.max(sum,msum);
    }
}