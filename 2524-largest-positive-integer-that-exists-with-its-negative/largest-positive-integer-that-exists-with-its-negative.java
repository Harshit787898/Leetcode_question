class Solution {
    public boolean contneg(HashMap<Integer,Integer> map,int n){
        int temp=(-1)*n;
        if(map.containsKey(temp)){
            return true;
        }
        else{
            return false;
        }
    }
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
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
        for(int i=nums.length-1;i>=0;i--){
            if(contneg(map,nums[i]))
            return nums[i];
        }
        return -1;
    }
}