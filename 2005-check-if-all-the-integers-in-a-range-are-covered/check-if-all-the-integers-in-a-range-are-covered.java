class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        for(int i=left;i<=right;i++){
            int flag=0;
            for(int[] range:ranges){
                if(i>=range[0]&&i<=range[1]){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                return false;
            }
        }
        return true;
    }
}