class Solution {
    HashMap<List<Integer>,Integer> map=new HashMap<>();
    public int solve(int i,int j,int[][] matrix){
        if (i == matrix.length - 1) {
            return matrix[i][j];
        }
        List<Integer> temp=new ArrayList<>();
        temp.add(i);
        temp.add(j);
        if(map.containsKey(temp)){
            return map.get(temp);
        }
        int b = matrix[i][j] + solve(i + 1, j, matrix);
        int l = (j > 0) ? matrix[i][j] + solve(i + 1, j - 1, matrix) : Integer.MAX_VALUE;
        int r = (j < matrix.length - 1) ? matrix[i][j] + solve(i + 1, j + 1, matrix) : Integer.MAX_VALUE;
        map.put(temp,Math.min(b, Math.min(l, r)));
        return map.get(temp);
    }
    public int minFallingPathSum(int[][] matrix) {
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<matrix[0].length;i++){
            ans=Math.min(ans,solve(0,i,matrix));
        }
        return ans;
    }
}