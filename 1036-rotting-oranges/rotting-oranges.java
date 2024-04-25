class Solution {
    public int orangesRotting(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int [][]vis=new int[n][m];
        int ans=0;
        Queue<Pair<Integer,Integer>> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    q.offer(new Pair<Integer,Integer>(i,j));
                    vis[i][j]=1;
                }
            }
        }
        while(!q.isEmpty()){
            int len=q.size();
            while(len!=0){
                Pair<Integer,Integer> temp=q.poll();
                int i=temp.getKey();
                int j=temp.getValue();
                grid[i][j]=2;
                int dx[]={0,0,1,-1};
                int dy[]={1,-1,0,0};
                for(int k=0;k<4;k++){
                    if(i+dx[k]>=0 && i+dx[k]<n && j+dy[k]>=0 && j+dy[k]<m && grid[i+dx[k]][j+dy[k]]==1 && vis[i+dx[k]][j+dy[k]]==0){
                        vis[i+dx[k]][j+dy[k]]=1;
                        q.offer(new Pair<Integer,Integer>(i+dx[k],j+dy[k]));
                    }
                }
                len--;
            }
            if(q.size()==0)
            break;
            ans++;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    return -1;
                }
            }
        }
        return ans;
    }
}