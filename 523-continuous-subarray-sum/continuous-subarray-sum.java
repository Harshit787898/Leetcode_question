class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        for(int i=1;i<nums.length;i++){
            nums[i]=nums[i]+nums[i-1];
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]%k;
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i]) && (i-map.get(nums[i])>1)){
                return true;
            }
            else if(!map.containsKey(nums[i]))
            map.put(nums[i],i);
        }
        return false;
    }
}