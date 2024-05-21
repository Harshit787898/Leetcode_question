class Solution {
    public void solve(List<Integer> subset,List<List<Integer>> powerset,int[] nums,int i){
        if(i==nums.length){
            powerset.add(new ArrayList<>(subset));
        }else{
            solve(subset,powerset,nums,i+1);
            subset.add(nums[i]);
            solve(subset,powerset,nums,i+1);
            subset.remove(subset.size()-1);
        }
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> subset=new ArrayList<>();
        List<List<Integer>> powerset=new ArrayList<>();
        solve(subset,powerset,nums,0);
        return powerset;
    }
}