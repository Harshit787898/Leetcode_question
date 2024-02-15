class Solution {
    public long largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int t=Integer.MAX_VALUE;
        long s[]=new long[nums.length];
        s[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            s[i]=nums[i]+s[i-1];
        }
        for(int i=nums.length-1;i>=2;i--){
            if(s[i-1]>nums[i]){
                t=i;
                break;
            }
        }
        if(t==Integer.MAX_VALUE||t<2){
            return -1;
        }
        return s[t];
    }
}