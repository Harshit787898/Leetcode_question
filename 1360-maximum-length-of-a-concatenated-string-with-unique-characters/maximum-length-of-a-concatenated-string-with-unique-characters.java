class Solution {
    private int backtrack(List<String> arr, int i, String t) {
        if (i == arr.size()) {
            return t.length();
        }
        int nottake= backtrack(arr, i + 1,t);
        if (isValid(arr.get(i),t)) {
            String s = t + arr.get(i);
            int take = backtrack(arr, i + 1,s);
            return Math.max(take,nottake);
        }

        return nottake;
    }
    public boolean isValid(String s1,String s2){
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<s1.length();i++){
            set.add(s1.charAt(i));
        }
        for(int i=0;i<s2.length();i++){
            set.add(s2.charAt(i));
        }
        String t=s1+s2;
        if(set.size()==t.length())
        return true;
        return false;
    }
    public int maxLength(List<String> arr) {
         return backtrack(arr, 0, "");
    }
}