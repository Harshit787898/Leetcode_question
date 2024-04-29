class Solution {
    public int minOperations(int[] nums, int k) {
        int xor=0;
        int c=0;
        for(int n:nums){
            xor^=n;
        }
        xor^=k;
        while(xor!=0){
            int temp=xor%2;
            if(temp==1)
            c++;
            xor=xor/2;
        }
        return c;
    }
}