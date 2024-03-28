class Solution {
    public void dfs(int i,int j,char[][] board,int vis[][]){
        vis[i][j]=1;
        int[][] dir=new int[][]{{-1,0},{0,1},{1,0},{0,-1}};
        for(int[] x:dir){
            int ni=i+x[0];
            int nj=j+x[1];
            if(ni>0&&ni<board.length&&nj>0&&nj<board[0].length&&board[ni][nj]=='O'&&vis[ni][nj]==0){
                dfs(ni,nj,board,vis);
            }
        }
    }
    public void solve(char[][] board) {
        int m=board.length;
        int n=board[0].length;
        int vis[][]=new int[m][n];
        for(int i=0;i<n;i++){
            if(board[0][i]=='O'&&vis[0][i]!=1){
                dfs(0,i,board,vis);
            }
        }
        for(int i=0;i<n;i++){
            if(board[m-1][i]=='O'&&vis[m-1][i]!=1){
                dfs(m-1,i,board,vis);
            }
        }
        for(int i=0;i<m;i++){
            if(board[i][0]=='O'&&vis[i][0]!=1){
                dfs(i,0,board,vis);
            }
        }
        for(int i=0;i<m;i++){
            if(board[i][n-1]=='O'&&vis[i][n-1]!=1){
                dfs(i,n-1,board,vis);
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(vis[i][j]==0){
                    board[i][j]='X';
                }
            }
        }
    }
}