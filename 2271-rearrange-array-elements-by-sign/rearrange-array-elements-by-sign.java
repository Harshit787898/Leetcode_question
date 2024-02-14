class Solution {
    public int[] rearrangeArray(int[] nums) {
        List<Integer> p=new ArrayList<>();
        List<Integer> n=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                n.add(nums[i]);
            }
            else{
                p.add(nums[i]);
            }
        }
        int po=0,no=0;
        for(int i=0;i<nums.length;i+=1){
            if(i%2==0){
                nums[i]=p.get(po++);
            }
            else{
                nums[i]=n.get(no++);
            }
        }
        return nums;
    }
}