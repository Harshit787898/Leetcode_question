class Solution {
    public int countTriplets(int[] arr) {
        int c=0;
        for(int i=0;i<arr.length;i++){
            int xor=arr[i];
            for(int j=i+1;j<arr.length;j++){
                xor^=arr[j];
                if(xor==0){
                    c+=j-i;
                }
            }
        }
        return c;
    }
}