class Solution {
    public boolean dfs(int node,int[][] graph,boolean visited[],boolean path[],List<Integer> cycle){
        visited[node]=true;
        path[node]=true;
        for(int i:graph[node]){
            if(visited[i]==false){
                if(dfs(i,graph,visited,path,cycle)){
                    cycle.add(i);
                    return true;
                }
            }
            else if(path[i]==true){
                cycle.add(i);
                return true;
            }
        }
        path[node]=false;
        return false;
    }
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n=graph.length;
        List<Integer> cycle=new ArrayList<>();
        boolean visited[]=new boolean[n];
        boolean path[]=new boolean[n];
        for(int i=0;i<n;i++){
            if(visited[i]==false){
                if(dfs(i,graph,visited,path,cycle)){
                    cycle.add(i);
                }
            }
        }
        List<Integer> res=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(!cycle.contains(i)){
                res.add(i);
            }
        }
        return res;
    }
}