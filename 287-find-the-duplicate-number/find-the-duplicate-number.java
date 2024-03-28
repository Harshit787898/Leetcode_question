class Solution {
    public int findDuplicate(int[] nums) {
        int freq[]=new int[nums.length+1];
        for(int i=0;i<nums.length;i++)
        {
            freq[nums[i]]++;
        }
        int i;
        for( i=1;i<nums.length+1;i++)
        {
            if(freq[i]>=2)
            break;
        }
        return i;
    }
}