class Solution {
    public boolean isCommon(char ch, String[] words, int occurrence) {
        for (String word : words) {
            int count = 0;
            for (char c : word.toCharArray()) {
                if (c == ch) {
                    count++;
                }
            }
            if (count < occurrence) {
                return false;
            }
        }
        return true;
    }

    public List<String> commonChars(String[] words) {
        List<String> ans = new ArrayList<>();
        HashMap<Character, Integer> charCount = new HashMap<>();
        
        for (char ch : words[0].toCharArray()) {
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }
        
        for (char ch : charCount.keySet()) {
            int minOccur = charCount.get(ch);
            for (int i = 1; i <= minOccur; i++) {
                if (isCommon(ch, words, i)) {
                    ans.add(String.valueOf(ch));
                } else {
                    break;
                }
            }
        }

        return ans;
    }
}