class Solution {
    public int findJudge(int n, int[][] trust) {
        if(trust.length==0&&n==1){
            return 1;
        }
        List<Integer> temp=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<trust.length;i++){
            temp.add(trust[i][0]);
            if(map.containsKey(trust[i][1])){
                map.put(trust[i][1],map.get(trust[i][1])+1);
            }
            else{
                map.put(trust[i][1],1);
            }
        }
        for(int i=1;i<=n;i++){
            if(!temp.contains(i)&&map.containsKey(i)&&map.get(i)==n-1)
            return i;
        }
        return -1;
    }
}