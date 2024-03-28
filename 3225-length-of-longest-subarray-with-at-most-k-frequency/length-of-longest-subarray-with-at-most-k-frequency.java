class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int ws=0;
        int we=0;
        int ans=0;
        while(we<nums.length){
            if(map.containsKey(nums[we])){
                map.put(nums[we],map.get(nums[we])+1);
            }
            else{
                map.put(nums[we],1);
            }
            while(map.get(nums[we])>k){
                map.put(nums[ws],map.get(nums[ws])-1);
                ws++;
            }
            ans=Math.max(ans,we-ws+1);
            we++;
        }
        return ans;
    }
}