class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0;int j=0,c=0;
        while(i<g.length && j<s.length){
            if(s[j]>=g[i]){
                c++;
                i++;
            }
            j++;
        }
        return c;
    }
}