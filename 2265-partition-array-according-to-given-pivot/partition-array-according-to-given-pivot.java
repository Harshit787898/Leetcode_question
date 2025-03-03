class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> less=new ArrayList<>();
        List<Integer> more=new ArrayList<>();
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot){
                less.add(nums[i]);
            }else if(nums[i]>pivot){
                more.add(nums[i]);
            }else{
                c+=1;
            }
        }
        int ans[]=new int[nums.length];
        int i=0;
        for(i=0;i<less.size();i++){
            ans[i]=less.get(i);
        }
        while(c!=0){
            ans[i++]=pivot;
            c-=1;
        }
        for(int j=0;j<more.size();j++){
            ans[i++]=more.get(j);
        }
        return ans;
    }
}