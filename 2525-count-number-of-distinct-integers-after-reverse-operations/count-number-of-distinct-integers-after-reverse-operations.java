class Solution {
    public int reverse(int n){
        int rev=0;
        while(n!=0){
            int d=n%10;
            rev=rev*10+d;
            n=n/10;
        }
        return rev;
    }
    public int countDistinctIntegers(int[] nums) {
       List<Integer> temp=new ArrayList<>();
       for(int i=0;i<nums.length;i++){
           temp.add(nums[i]);
           temp.add(reverse(nums[i]));
       }
       HashSet<Integer> set=new HashSet<>();
       for(int i=0;i<temp.size();i++){
           set.add(temp.get(i));
       }
       return set.size();
    }
}