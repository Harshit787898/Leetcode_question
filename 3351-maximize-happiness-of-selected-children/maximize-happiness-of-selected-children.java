class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        long ans = 0;
        int c=0;
        for(int i = happiness.length - 1; i >= happiness.length-k; i--) {
            happiness[i]=Math.max(happiness[i]-c,0);
            ans += happiness[i];
            c++;
        }
        return ans;
    }
}
