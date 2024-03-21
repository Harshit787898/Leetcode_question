//Creating a graph and detecting cycle-: if cycle found then return false else return true (DFS Approach)
class Solution1 {
    public boolean dfs(int node,List<List<Integer>> graph,boolean visited[],boolean path[]){
        visited[node]=true;
        path[node]=true;
        for(int i:graph.get(node)){
            if(visited[i]==false){
                if(dfs(i,graph,visited,path)){
                    return true;
                }
            }
            else if(path[i]==true){
                return true;
            }
        }
        path[node]=false;
        return false;
    }
    public boolean canFinish(int n, int[][] course) {
        List<List<Integer>> graph=new ArrayList<>();
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>(i));
        }
        for(int c[]:course){
            graph.get(c[1]).add(c[0]);
        }
        boolean visited[]=new boolean[n];
        boolean path[]=new boolean[n];
        for(int i=0;i<n;i++){
            if(visited[i]==false){
                if(dfs(i,graph,visited,path)){
                    return false;
                }
            }
        }
        return true;
    }
}

//Creating a graph and detecting cycle-: if cycle found then return false else return true (BFS Approach)
class Solution{
    public boolean canFinish(int n, int[][] course) {
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
            return true;
        }
        return false;
    }
}