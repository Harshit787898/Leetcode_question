class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            if(map.containsKey(n)){
                map.put(n,map.get(n)+1);
            }
            else{
                map.put(n,1);
            }
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            int k=entry.getKey();
            int v=entry.getValue();
            if(v==2){
                ans.add(k);
            }
        }
        return ans;
    }
}