class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int c=0;
        int ans= 0;
        map.put(0, -1);
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==0)
            c+=1;
            else{
                c-=1;
            }
            if (map.containsKey(c)) {
                ans= Math.max(ans,i-map.get(c));
            } else {
                map.put(c,i);
            }
        }
        return ans;
    }
}