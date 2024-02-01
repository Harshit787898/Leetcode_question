class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        List<List<Integer>> res=new ArrayList<>();
        for(int i=2;i<nums.length;i+=3){
            if(nums[i]-nums[i-2]<=k){
                List<Integer> temp=new ArrayList<>();
                temp.add(nums[i]);
                temp.add(nums[i-1]);
                temp.add(nums[i-2]);
                res.add(temp);
            }
            else
            return new int[0][0];
        }
        int ans[][]=new int[res.size()][3];
        for(int i=0;i<res.size();i++){
            ans[i][0]=res.get(i).get(0);
            ans[i][1]=res.get(i).get(1);
            ans[i][2]=res.get(i).get(2);
        }
        return ans;
    }
}