class Solution {
    public int solve(int []nums,int n){
        Arrays.sort(nums);
        int sum = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum <= n) {
                count++;
            } else {
                break;
            }
        }
        return count;
    }
    public int[] answerQueries(int[] nums, int[] queries) {
        int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            ans[i] = solve(nums, queries[i]);
        }
        return ans;
    }
}