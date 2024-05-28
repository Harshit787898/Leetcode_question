class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int ws=0;
        int we=0;
        int ans=0;
        int curr_c=0;
        while(we<s.length()){
            curr_c+=Math.abs(s.charAt(we)-t.charAt(we));
            while(curr_c>maxCost&&ws<s.length()){
                curr_c-=Math.abs(s.charAt(ws)-t.charAt(ws));
                ws++;
            }
            ans=Math.max(ans,we-ws+1);
            we++;
        }
        return ans;
    }
}