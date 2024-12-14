//Brute Force
class Solution1 {
    public boolean isValid(int []nums,int i,int j){
        for(int st=i;st<=j;st+=1){
            for(int en=i;en<=j;en+=1){
                if(Math.abs(nums[st]-nums[en])>2){
                    return false;
                }
            }
        }
        return true;
    }
    public long continuousSubarrays(int[] nums) {
        long c=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                if(isValid(nums,i,j)){
                    c++;
                }
            }
        }
        return c;
    }
}


//Sliding Window Basic
class Solution2{
    public int findMin(int[]nums,int st,int en){
        int min=Integer.MAX_VALUE;
        for(int i=st;i<=en;i++){
            min=Math.min(min,nums[i]);
        }
        return min;
    } 
    public int findMax(int[]nums,int st,int en){
        int max=0;
        for(int i=st;i<=en;i++){
            max=Math.max(max,nums[i]);
        }
        return max;
    } 
    public long continuousSubarrays(int[] nums) {
        int ws=0;
        int we=0;
        long ans=0;
        while(we<nums.length){
           int min=findMin(nums,ws,we);
           int max=findMax(nums,ws,we);
            while(max-min>2){
                ws+=1;
                max=findMax(nums,ws,we);
                min=findMin(nums,ws,we);
            }
           ans+=we-ws+1;
           we+=1;
        }
        return ans;
    }
}


//Sliding Window using ProrityQueue
class Solution{
    public long continuousSubarrays(int[] nums) {
        int ws=0;
        int we=0;
        long ans=0;
        PriorityQueue<Integer> max_pq=new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> min_pq=new PriorityQueue<>();
        while(we<nums.length){
            max_pq.offer(nums[we]);
            min_pq.offer(nums[we]);
            while(max_pq.peek()-min_pq.peek()>2){
                max_pq.remove(nums[ws]);
                min_pq.remove(nums[ws]);
                ws+=1;
            }
           ans+=we-ws+1;
           we+=1;
        }
        return ans;
    }
}