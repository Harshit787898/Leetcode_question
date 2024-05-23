class Solution {
    public void solve(ArrayList<ArrayList<Integer>>powerset, ArrayList<Integer> subset,int nums[],int i){
        if(i==nums.length){
            powerset.add(new ArrayList<>(subset));
        }
        else{
            solve(powerset,subset,nums,i+1);
            subset.add(nums[i]);
            solve(powerset,subset,nums,i+1);
            subset.remove(subset.size()-1);
        }
    }
    public boolean isbeautiful(ArrayList<Integer> subset,int k){
        for(int i=0;i<subset.size();i++){
            for(int j=0;j<subset.size();j++){
                if(Math.abs(subset.get(i)-subset.get(j))==k){
                    return false;
                }
            }
        }
        return true;
    }
    public int beautifulSubsets(int[] nums, int k) {
        ArrayList<ArrayList<Integer>>powerset=new ArrayList<>();
        ArrayList<Integer> subset=new ArrayList<>();
        solve(powerset,subset,nums,0);
        int c=0;
        for(int i=0;i<powerset.size();i++){
            if(powerset.get(i).size()==1){
                c++;
            }
            else if(isbeautiful(powerset.get(i),k)){
                c++;
            }
        }
        return c-1;
    }
}