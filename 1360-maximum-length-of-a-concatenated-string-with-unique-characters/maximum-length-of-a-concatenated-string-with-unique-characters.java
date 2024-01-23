class Solution {
    private int backtrack(List<String> arr, int index, String current) {
        int maxLen = current.length();

        for (int i = index; i < arr.size(); i++) {
            if (isValid(arr.get(i), current)) {
                String newString = current + arr.get(i);
                maxLen = Math.max(maxLen, backtrack(arr, i + 1, newString));
            }
        }

        return maxLen;
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