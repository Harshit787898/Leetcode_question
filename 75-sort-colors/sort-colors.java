class Solution {
    public void sortColors(int[] nums) {
        int low=0,mid=0,high=nums.length-1,t;
        while(mid<=high)
        {
            if(nums[mid]==1)
                mid++;
            else if(nums[mid]==0)
            {
                t=nums[mid];
                nums[mid]=nums[low];
                nums[low]=t;
                low++;
                mid++;
            }
            else 
            {
                t=nums[mid];
                nums[mid]=nums[high];
                nums[high]=t;
                high--;
            }
        }
        
    }
}