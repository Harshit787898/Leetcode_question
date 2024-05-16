class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum=0;
        double avg=Integer.MIN_VALUE;
        int ws=0;
        int we=0;
        while(we<nums.length){
            sum+=nums[we];
            if(we-ws+1==k){
                avg=Math.max(avg,sum/k);
                sum-=nums[ws];
                ws++;
            }
            we++;
        }
        return avg;
    }
}