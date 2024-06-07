class Solution {
public:
    string findRoot(const string& word, const unordered_set<string>& dictSet) {
        for (int i = 1; i <= word.length(); ++i) {
            if (dictSet.find(word.substr(0, i)) != dictSet.end()) {
                return word.substr(0, i);
            }
        }
        return word;
    }

    string replaceWords(vector<string>& dictionary, string sentence) {
        unordered_set<string> dictSet(dictionary.begin(), dictionary.end());
        istringstream st(sentence);
        string word;
        vector<string> words;
        while (st >> word) {
            words.push_back(word);
        }

        ostringstream ans;
        for (size_t i = 0; i < words.size(); ++i) {
            string root = findRoot(words[i], dictSet);
            if (i != 0) {
                ans << " ";
            }
            ans << root;
        }
        return ans.str();
    }
};
