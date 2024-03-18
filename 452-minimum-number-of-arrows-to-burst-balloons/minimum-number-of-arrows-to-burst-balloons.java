class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,(a, b) -> Double.compare(a[1], b[1]));
        int ans = 1;
        int target = points[0][1];
        for (int i=0;i<points.length;i++) {
            if (points[i][0]>target) {
                ans++;
                target=points[i][1];
            }
        }
        return ans;
    }
}