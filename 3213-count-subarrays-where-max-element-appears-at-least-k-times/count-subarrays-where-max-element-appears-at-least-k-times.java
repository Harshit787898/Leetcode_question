class Solution {
    public long countSubarrays(int[] nums, int k) {
        long count=0;
        int max=0;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
        }
        int ws=0;
        int we=0;
        int maxf=0;
        while(we<nums.length){
            if(nums[we]==max){
                maxf+=1;
            }
            while(maxf>=k){
                count+=nums.length-we;
                if(nums[ws]==max){
                    maxf-=1;
                }
                ws++;
            }
            we++;
        }
        return count;
    }
}