class Solution {
    public int[] productExceptSelf(int[] nums) {
        int p[]=new int[nums.length];
        long pro=1;
        for(int i=0;i<nums.length;i++){
            pro=nums[i]*pro;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            p[i]=(int)pro/nums[i];
            else{
                int pr=1;
                for(int j=0;j<nums.length;j++){
                    if(i!=j){
                        pr*=nums[j];
                    }
                }
                p[i]=pr;
            }
        }
        return p;
    }
}