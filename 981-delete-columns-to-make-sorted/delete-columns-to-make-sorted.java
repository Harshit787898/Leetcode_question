class Solution {
    public int minDeletionSize(String[] strs) {
        int ans=0;
        for(int i=0;i<strs[0].length();i++){
            for(int j=0;j<strs.length-1;j++){
                if(strs[j].charAt(i)>strs[j+1].charAt(i)){
                    ans+=1;
                    break;
                }
            }
        }
        return ans;
    }
}