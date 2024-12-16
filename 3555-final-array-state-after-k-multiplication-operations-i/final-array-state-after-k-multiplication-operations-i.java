class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            pq.offer(nums[i]);
        }
        while(k!=0){
            int val=pq.poll();
            for(int i=0;i<nums.length;i++){
                if(nums[i]==val){
                    nums[i]=nums[i]*multiplier;
                    break;
                }
            }
            pq.offer(val*multiplier);
            k-=1;
        }
        return nums;
    }
}