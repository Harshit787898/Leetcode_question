class Solution {
    public int[] findOrder(int n, int[][] course) {
         List<List<Integer>> graph=new ArrayList<>();
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>(i));
        }
        int indegree[]=new int[n];
        for(int c[]:course){
            graph.get(c[1]).add(c[0]);
            indegree[c[0]]+=1;
        }
        Queue<Integer> q=new LinkedList<>();
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(indegree[i]==0){
                q.add(i);
            }
        }
        while(!q.isEmpty()){
            int x=q.poll();
            ans.add(x);
            for(int i:graph.get(x)){
                indegree[i]-=1;
                if(indegree[i]==0){
                    q.add(i);
                }
            }
        }
        if(ans.size()==n){
            int res[]=new int[ans.size()];
            for(int i=0;i<ans.size();i++){
                res[i]=ans.get(i);
            }
            return res;
        }
        return new int[0];
    }
}