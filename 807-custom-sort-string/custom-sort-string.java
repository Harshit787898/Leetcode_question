class Solution {
    public String customSortString(String order, String s) {
        HashMap<Character, Integer> temp = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            temp.put(c, temp.getOrDefault(c, 0) + 1);
        }
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < order.length(); i++) {
            char c = order.charAt(i);
            while (temp.containsKey(c) && temp.get(c) > 0) {
                ans.append(c);
                temp.put(c, temp.get(c) - 1);
            }
        }
        for (char c : temp.keySet()) {
            int count = temp.get(c);
            while (count-- > 0) {
                ans.append(c);
            }
        }
        return ans.toString();
    }
}