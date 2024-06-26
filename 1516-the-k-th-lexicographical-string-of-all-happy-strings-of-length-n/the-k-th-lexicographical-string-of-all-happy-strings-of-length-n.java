class Solution {
    List<String> powerset=new ArrayList<>();
    public void permute(StringBuilder s, int n,int k) {
        if (s.length() == n) {
            powerset.add(s.toString());
            return;
        }
        if(powerset.size()==k)
        return ;
        char ch[] = { 'a', 'b', 'c' };
        for (int i = 0; i < 3; i++) {
            if (s.length() == 0 || ch[i] != s.charAt(s.length() - 1)) {
                s.append(ch[i]);
                permute(s,n,k);
                s.deleteCharAt(s.length() - 1);
            }
        }
    }

    public String getHappyString(int n, int k) {
        StringBuilder str = new StringBuilder();
        permute(str, n,k);
        return (k <= powerset.size()) ? powerset.get(k - 1) : "";
    }
}