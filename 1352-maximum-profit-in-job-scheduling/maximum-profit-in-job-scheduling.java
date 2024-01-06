class Solution {
    int n;
    
    private int getNext(ArrayList<int[]> nums, int low, int target) {
        int high = n - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (nums.get(mid)[0] >= target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
    
    private int solve(int i, ArrayList<int[]> nums, int[] dp) {
        if (i >= n) {
            return 0;
        }
        
        if (dp[i] != -1) return dp[i];
        
        int next = getNext(nums, i + 1, nums.get(i)[1]);
        int pick = nums.get(i)[2] + solve(next, nums, dp);
        int notPick = 0 + solve(i + 1, nums, dp);
        
        return dp[i] = Math.max(pick, notPick);
    }
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
          n = startTime.length;
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        
        ArrayList<int[]> nums = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            nums.add(new int[]{startTime[i], endTime[i], profit[i]});
        }
        
        Collections.sort(nums, (a, b) -> a[0] - b[0]);
        
        return solve(0, nums, dp);
    }
}