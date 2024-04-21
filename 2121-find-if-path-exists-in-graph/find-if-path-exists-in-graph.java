class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> graph=new ArrayList<>();
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }
        for(int[] e:edges){
            graph.get(e[0]).add(e[1]);
            graph.get(e[1]).add(e[0]);
        }
        Queue<Integer> q=new LinkedList<>();
        boolean visit[]=new boolean[n];
        visit[source]=true;
        q.add(source);
        while(!q.isEmpty()){
            int temp=q.poll();
            if(temp==destination)
            return true;
            for(int connect:graph.get(temp)){
                if(visit[connect]==false){
                    visit[connect]=true;
                    q.add(connect);
                }
            }
        }
        return false;
    }
}