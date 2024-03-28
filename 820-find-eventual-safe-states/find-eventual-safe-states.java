class Solution1 {
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

//S1-: Reverse all edges
//S2-: Find Indegrees in the graph
//S3-: Apply Topological sort
class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        List<Integer> safe=new ArrayList<>();
        List<List<Integer>> revgraph=new ArrayList<>();
        int indegree[]=new int[graph.length];
        for(int i=0;i<graph.length;i++){
            revgraph.add(new ArrayList<>());
        }

        //Reversing the graph and calculating indegrees
        for(int i=0;i<graph.length;i++){
            for(int j=0;j<graph[i].length;j++){
                revgraph.get(graph[i][j]).add(i);
                indegree[i]+=1;
            }
        }

        //BFS Topological Sort
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<revgraph.size();i++){
            if(indegree[i]==0){
                q.offer(i);
            }
        }
        while(!q.isEmpty()){
            int x=q.poll();
            safe.add(x);
            for(int v:revgraph.get(x)){
                indegree[v]-=1;
                if(indegree[v]==0){
                    q.offer(v);
                }
            }
        }
        Collections.sort(safe);
        return safe;
    }
}