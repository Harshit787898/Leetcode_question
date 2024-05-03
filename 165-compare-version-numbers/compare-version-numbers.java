class Solution {
    public int[] solve(int i,String s){
        int val=0;
        while(i<s.length()){
            if(s.charAt(i)=='.')
            break;
            else{
                val=val*10+(s.charAt(i)-'0');
            }
            i++;
        }
        return new int[]{val,i+1};
    }
    public int compareVersion(String version1, String version2) {
        int i=0,j=0;
        while(i<version1.length() || j<version2.length()){
            int temp1[]=solve(i,version1);
            int temp2[]=solve(j,version2);
            int ans1=temp1[0];
            int ans2=temp2[0];
            i=temp1[1];
            j=temp2[1];
            if(ans1<ans2){
                return -1;
            }
            if(ans2<ans1){
                return 1;
            }
        }
        return 0;
    }
}