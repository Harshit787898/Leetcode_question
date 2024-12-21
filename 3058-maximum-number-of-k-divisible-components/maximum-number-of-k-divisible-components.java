class Solution {
    int ans=0;
    public int solve(ArrayList<ArrayList<Integer>> adj,int[]values,int nod,int par,int k){
        int s=values[nod];
        for(int node:adj.get(nod)){
            if(node!=par){
                s+=solve(adj,values,node,nod,k);
            }
        }
        if(s%k==0){
            ans+=1;
            return 0;
        }
        return s%k;
    }
    public int maxKDivisibleComponents(int n, int[][] edges, int[] values, int k) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            adj.get(edges[i][0]).add(edges[i][1]);
            adj.get(edges[i][1]).add(edges[i][0]);
        }
        int t=solve(adj,values,0,-1,k);
        return ans;
    }
}