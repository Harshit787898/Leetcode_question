class Solution {
    public int findChampion(int n, int[][] edges) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<edges.length;i++){
            set.add(edges[i][1]);
        }
        int c=0;
        int ans=0;
        for(int i=0;i<n;i++){
            if(!set.contains(i)){
                c+=1;
                ans=i;
            }
        }
        return c==1?ans:-1;
    }
}