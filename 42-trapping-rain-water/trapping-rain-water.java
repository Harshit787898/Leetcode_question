class Solution {
    public int trap(int[] height) {
        int left=height[0];
        int right=height[height.length-1];
        int l=0;
        int r=height.length-1;
        int sum=0;
        while(l<r){
            if(left<=right){
                sum+=left-height[l++];
                left=Math.max(left,height[l]);
            }
            else{
                sum+=right-height[r--];
                right=Math.max(right,height[r]);
            }
        }
        return sum;
    }
}