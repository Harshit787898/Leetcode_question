class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        HashSet<List<Integer>> set=new HashSet<>();
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<nums.length-2;i++){
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum==0){
                    set.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
                }
                else if(sum<0){
                    j++;
                }
                else{
                    k--;
                }
            }
        }
        for(List<Integer> a:set){
            ans.add(a);
        }
        return ans;
    }
}