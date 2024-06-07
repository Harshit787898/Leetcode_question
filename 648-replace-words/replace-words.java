import java.util.StringTokenizer;
class Solution {
    public String findRoot(String word, Set<String> dictSet) {
        for (int i = 1; i <= word.length(); i++) {
            String prefix = word.substring(0, i);
            if (dictSet.contains(prefix)) {
                return prefix;
            }
        }
        return word;
    }
    public String replaceWords(List<String> dictionary, String sentence) {
        HashSet<String> dictSet = new HashSet<>(dictionary);
        StringTokenizer st=new StringTokenizer(sentence);
        List<String> s=new ArrayList<>();
        while(st.hasMoreTokens()){
            s.add(st.nextToken());
        }
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.size(); i++) {
            String word = s.get(i);
            String root = findRoot(word, dictSet);
            if (i != 0) {
                ans.append(" ");
            }
            ans.append(root);
        }
        return ans.toString();
    }
}