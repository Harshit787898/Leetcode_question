class Solution {
    int count(String s){
        int c=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1')
            c++;
        }
        return c;
    }
    public int numberOfBeams(String[] bank) {
        int ans = 0, temp = 0;
        for (String str : bank) {
            int n = count(str);
            if (n == 0) continue;
            ans += temp * n;
            temp = n;
        }
        return ans;
    }
}