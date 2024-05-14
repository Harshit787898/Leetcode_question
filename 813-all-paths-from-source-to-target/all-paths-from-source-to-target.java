class Solution {
    public void solve(int[][]graph,List<Integer> path,List<List<Integer>>paths,int i,int j){
        if(i==0){
            path.add(0);
        }
        if(i==j){
            paths.add(new ArrayList(path));
        }
        else{
            for(int neigh:graph[i]){
                path.add(neigh);
                solve(graph,path,paths,neigh,j);
                path.remove(path.size()-1);
            }
        }
    }
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> paths=new ArrayList<>();
        List<Integer> path=new ArrayList<>();
        solve(graph,path,paths,0,graph.length-1);
        return paths;
    }
}