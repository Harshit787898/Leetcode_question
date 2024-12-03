class Solution {
    public String addSpaces(String s, int[] spaces) {
        HashSet<Integer> set=new HashSet<>();
        for(int sp:spaces){
            set.add(sp);
        }
        StringBuilder str=new StringBuilder();
        int p=0;
        for(int i=0;i<s.length();i++){
            if(set.contains(i)){
                str.append(' ');
            }
            str.append(s.charAt(i));
        }
        return str.toString();
    }
}