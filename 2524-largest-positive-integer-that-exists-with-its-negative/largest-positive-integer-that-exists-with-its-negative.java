class Solution {
    public boolean contneg(HashSet<Integer> set,int n){
        int temp=(-1)*n;
        if(set.contains(temp)){
            return true;
        }
        else{
            return false;
        }
    }
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        for(int i=nums.length-1;i>=0;i--){
            if(contneg(set,nums[i]))
            return nums[i];
        }
        return -1;
    }
}