class Solution {
    public int[] findErrorNums(int[] nums) {
        int i,max=0,ans[]=new int[2];
        int freq[]=new int[nums.length+1];
        for(i=0;i<nums.length;i++)
            freq[nums[i]]++;
        for(i=0;i<=nums.length;i++)
        {
            if(freq[i]==2){
                ans[0]=i;
                break;
            }
        }
        for(i=1;i<=nums.length;i++)
        {
            if(freq[i]==0)
            {
                ans[1]=i;
                break;
            }
        }
        return ans;
    }
}