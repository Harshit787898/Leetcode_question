class Solution {
    public boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length())
            return false;
        
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for (char c : word1.toCharArray()) {
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }

        for (char c : word2.toCharArray()) {
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }

        // Check if the set of characters is the same
        if (!map1.keySet().equals(map2.keySet())) {
            return false;
        }

        // Check if the counts of frequencies are the same, regardless of character
        return map1.values().stream().sorted().collect(Collectors.toList())
               .equals(map2.values().stream().sorted().collect(Collectors.toList()));
    }
}