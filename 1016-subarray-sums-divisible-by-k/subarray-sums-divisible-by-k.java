class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int sum=0;
        int c=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int div=sum%k;
            if(div<0){
                div+=k;
            }
            if(map.containsKey(div)){
                c+=map.get(div);
                map.put(div,map.get(div)+1);
            }else{
                map.put(div,1);
            }
        }
        return c;
    }
}