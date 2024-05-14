class Solution {
    public int solve(int [][]grid,int i,int j,int m,int n){
        if (i < 0 || j < 0 || i >= m || j >= n || grid[i][j] == 0) {
            return 0;
        }
        int c= grid[i][j];
        grid[i][j] = 0; 
        int left = solve(grid, i, j - 1, m, n);
        int right = solve(grid, i, j + 1, m, n);
        int up = solve(grid, i - 1, j, m, n);
        int down = solve(grid, i + 1, j, m, n);
        grid[i][j] = c;
        return c+ Math.max(left, Math.max(right, Math.max(up, down)));
    }
    public int getMaximumGold(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int max=0;
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] != 0) {
                    max = Math.max(max, solve(grid, i, j, m, n));
                }
            }
        }
        
        return max;
    }
}